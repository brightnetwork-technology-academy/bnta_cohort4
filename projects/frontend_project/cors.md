# Connecting React & Spring

We've seen that making a request to a local API is no different to making a request to a remotely-hosted one: we simply pass the URL into our `fetch` request, parse out the json and `setState`.

```jsx

fetch("http://localhost:8080/api/things)
	.then(response => response.json())
	.then(data => setState(data));

```

There is a crucial configuration step which has been added to our Spring apps to make this possible - without it we'd be staring at errors as soon as we tried to load the data.

## CORS

There is a security mechanism built into the header of every HTTP request called **Cross-Origin Resource Sharing**, or **CORS**. In a nutshell it prevents requests being made across domains without explicit permissions being set. For example, imagine you had two tabs open in your browser. Hypothetically a script could run in the application open in tab A and interact with the application in tab B. Not a big deal if you're reading the news, a massive problem if you're checking your bank account. One of the reasons this can't happen is CORS.

Even though it's useful in our awful hypothetical scenario, it's a pain when it comes to letting our own apps talk to each other. Any HTTP request has CORS enabled by default and includes information about the type of request and where it has come from, which our servers currently don't know how to handle.

#### But why does it work if I just type the URL in the address bar?

The problem here is the *origin* of the request. As far as the server is concerned when you type `localhost:8080` into the address bar the request is coming from the system, which is hosting the server. That means it's coming from the same place and there's no problem. When we make a request from a React app it's coming from something running on `localhost:3000`, not the browser (even though we use the browser to interact with the app). That's a different origin, which the server doesn't like.

## Setting up the Server

The good news is that there isn't much work needed to configure our Spring apps for CORS. As with many things in Spring there are a couple of ways in which we can do this but here we'll strike a balance between clarity in what's going on and minimising the changes we need to make to our code. We'll start by adding a `configurations` package to the app and creating a `SpringGlobalConfig` class inside it.

Our configuration is going to implement an interface which will expose various methods for configuring HTTP resources. We'll also annotate it as a bean using the `@Configuration` annotation.

```java
// SpringGlobalConfig.java

@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer{

}
```

This interface provides default implementations for many methods, one of which we will override.

```java
// SpringGlobalConfig.java

@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
        
    }

}
```

The `CorsRegistry` object is created and passed to the method when the application is initialised. Within the method we can modify it to configure which sources we should accept requests from, which types of requests to accept and many other properties. We can accept any and all requests by using the wildcard `"*"` in our setup.

```java
// SpringGlobalConfig.java

@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("*");
    }

}
```

In the real world we would likely be a bit more specific, though. If we were to configure this for the [pet API task](task_pets/pet_task.md) it would look like this:

```java
// SpringGlobalConfig.java

@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
        // Configure which route in the controller the mapping applies to
        registry.addMapping("/pets")
        		// Accept requests originating from this location
                .allowedOrigins("http://localhost:3000")
                // Acceptable parameters for headers, eg. authentication, content-type, etc
                // We leave the wildcard here as there are many more headers to consider than we've covered so far
                .allowedHeaders("*")
                // HTTP methods the origin is allowed to make
                .allowedMethods("GET, POST");
    }

}
```

With this setup a React app hosted on `localhost:3000` can make a `GET` or a `POST` request to `localhost:8080/pets` without any issues. If an app hosted at a different IP address makes the request, or if our local app tries to make a different type of request, it will be denied by CORS.