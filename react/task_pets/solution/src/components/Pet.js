const Pet = ({pet}) => {

    return (
        <div className="pet-tile">
            <h4>{pet.name} the {pet.type}</h4>
            <p>{pet.breed}</p>
            <p>{pet.age} years old</p>
        </div>
    )

}

export default Pet;