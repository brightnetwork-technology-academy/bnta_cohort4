import { useState, useEffect } from "react"
import PetForm from "../components/PetForm"
import PetList from "../components/PetList"

const PetContainer = () => {

    const [pets, setPets] = useState([]);

    const loadPetData = () => {
        fetch("http://localhost:8080/pets")
            .then(response => response.json())
            .then(data => setPets(data));
    }

    const submitNewPet = (newPet) => {
        fetch("http://localhost:8080/pets", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(newPet)
        })
            .then(loadPetData);
    }

    useEffect(loadPetData, []);

    return(
        <div className="grid-container">
            <PetForm onPetSubmission={submitNewPet}/>
            <PetList pets={pets}/>
        </div>
    )

}

export default PetContainer