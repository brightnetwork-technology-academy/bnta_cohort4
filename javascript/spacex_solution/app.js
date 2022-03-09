const button = document.querySelector("#fetch-button");

const list = document.querySelector("#launch-details");

let launches = [];

const handleLoadDataButtonClick = async () => {
    console.log("button clicked")
    const result = await fetch("https://api.spacexdata.com/v5/launches")
    launches = await result.json();

    launches.forEach(element => {
        const heading = document.createElement("dt");
        const content = document.createElement("dd");

        heading.innerText = `Launch number: ${element.flight_number}`;
        content.innerText = element.details;

        list.appendChild(heading);
        list.appendChild(content)
    });

}

button.addEventListener("click", handleLoadDataButtonClick);