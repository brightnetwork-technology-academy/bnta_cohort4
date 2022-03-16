import { useState } from "react";
import Buttons from "../components/Buttons";
import Film from "../components/Film";

const FilmContainer = () => {

    const [films, setFilms] = useState(
        [
            {
                "title": "Alien",
                "duration": 117,
                "rating": "18",
                "cast": [
                    {
                        "name": "Sigourney Weaver"
                    }
                ],
                "director": {
                    "name": "Ridley Scott"
                }
            },
            {
                "title": "The Imitation Game",
                "duration": 114,
                "rating": "12A",
                "cast": [
                    {
                        "name": "Benedict Cumberbatch"
                    }
                ],
                "director": {
                    "name": "Morten Tyldum"
                }
            },
            {
                "title": "Iron Man",
                "duration": 126,
                "rating": "12A",
                "cast": [
                    {
                        "name": "Robert Downey Jr"
                    },
                    {
                        "name": "Gwyneth Paltrow"
                    }
                ],
                "director": {
                    "name": "Jon Favreau"
                }
            },
            {
                "title": "The Martian",
                "duration": 144,
                "rating": "12A",
                "cast": [
                    {
                        "name": "Matt Damon"
                    },
                    {
                        "name": "Sean Bean"
                    }
                ],
                "director": {
                    "name": "Ridley Scott"
                }
            }
        ]
    );

    const [currentFilmIndex, setCurrentFilmIndex] = useState(0);

    const handleNextButtonClick = () => {
        if (currentFilmIndex < films.length - 1){
            setCurrentFilmIndex(currentFilmIndex + 1);
        }
    }

    const handlePreviousButtonClick = () => {
        if (currentFilmIndex > 0) {   
            setCurrentFilmIndex(currentFilmIndex - 1);
        }
    }

    const handleFilmIndexSubmission = (event) => {
        event.preventDefault();
        setCurrentFilmIndex(event.target["film-selector"].value - 1)
    }

    return (
        <div className="container">
            <h1>Database of Movies on the Internet</h1>
            <Film film={films[currentFilmIndex]} />
            <hr/>
            <Buttons 
                onPreviousClick={handlePreviousButtonClick}
                onNextClick={handleNextButtonClick}
                maxFilmNumber={films.length}
                onFilmIndexSubmission={handleFilmIndexSubmission}
            />
        </div>
    )

}

export default FilmContainer;