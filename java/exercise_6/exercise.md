# Exercises

## ✅ Exercise 1
- Create gender enum
- Create a class Person with Name and Gender
- Take the following imperative code and turn into declarative using Streams.
```
List<Person> people = List.of(
        new Person("Smith", Gender.FEMALE),
        new Person("Anna", Gender.FEMALE),
        new Person("Alex", Gender.MALE),
        new Person("Oliver", Gender.MALE)
);

List<Person> female = new ArrayList<>();

people.forEach(person -> {
    var isGender = person.gender.equals(Gender.FEMALE);
    if (isGender) {
        female.add(person);
    }
});

female.forEach(System.out::println);
```

```
public static class Person {
        String name;
        Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
```

## ✅ Exercise 1

```
id,first_name,last_name,email,gender
1,Fanchette,Williamson,fwilliamson0@github.com,F
2,Aleksandr,Matts,amatts1@webs.com,M
3,Maurie,Cordero,mcordero2@google.co.jp,M
4,Donnajean,Crowson,dcrowson3@google.com.hk,F
5,Ricardo,Gofton,rgofton4@nytimes.com,M
6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
7,Marjorie,Blumsom,mblumsom6@joomla.org,F
8,Lester,Huyghe,lhuyghe7@jugem.jp,M
9,Merrily,Stangoe,mstangoe8@tiny.cc,F
10,Reider,Karel,rkarel9@github.io,M
11,Dory,Jolliff,djolliffa@wufoo.com,F
12,Homerus,Averay,haverayb@skyrock.com,M
13,Alyda,Muglestone,amuglestonec@is.gd,F
14,Pinchas,Louca,ploucad@google.es,M
15,Cherin,Eltringham,celtringhame@parallels.com,F
16,Mufi,Rothert,mrothertf@dropbox.com,F
17,Jordana,Everex,jeverexg@ucla.edu,F
18,Belle,Rother,brotherh@auda.org.au,F
19,Clevie,Sifflett,csiffletti@furl.net,M
20,Gretchen,Abell,gabellj@1688.com,F
```

Using streams
- Map `F` to `FEMALE` and `M` to `MALE`
- filter females
- filter teenagers
- find if any email ends in `gov.uk`