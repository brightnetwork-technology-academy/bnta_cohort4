import { useState } from "react";

const PetForm = ({onPetSubmission}) => {

    const [name, setName] = useState("");
    const [age, setAge] = useState(0);
    const [type, setType] = useState("");
    const [breed, setBreed] = useState("");

    const handleNameChange = (event) => {
        setName(event.target.value);
    }

    const handleAgeChange = (event) => {
        setAge(event.target.value);
    }

    const handleTypeChange = (event) => {
        setType(event.target.value);
    }

    const handleBreedChange = (event) => {
        setBreed(event.target.value);
    }

    const handleFormSubmit = (event) => {
        event.preventDefault();

        const newPet = {
            name: name,
            age: age,
            type: type,
            breed: breed
        }

        onPetSubmission(newPet);
    }

    return (
        <div className="form-container">
            <h3>Add another pet:</h3>
            <form onSubmit={handleFormSubmit}>
                <div className="form-element">
                    <label htmlFor="name">Pet's name:</label>
                    <input type="text" id="name" value={name} onChange={handleNameChange}/>
                </div>
                <div className="form-element">
                    <label htmlFor="age">How old are they?</label>
                    <input type="number" id="age" min="0" value={age} onChange={handleAgeChange}/>
                </div>
                <div className="form-element">
                    <label htmlFor="type">What type of animal are they?</label>
                    <input type="text" id="type" value={type} onChange={handleTypeChange}/>
                </div>
                <div className="form-element">
                    <label htmlFor>What breed are they?</label>
                    <input type="text" id="breed" value={breed} onChange={handleBreedChange}/>
                </div>
                <input type="submit" value="Add Pet"/>
            </form>
        </div>
    )

}

export default PetForm;