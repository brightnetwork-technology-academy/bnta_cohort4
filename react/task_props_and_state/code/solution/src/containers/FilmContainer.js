import { useState } from "react";
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
        setCurrentFilmIndex(currentFilmIndex + 1);
    }

    const handlePreviousButtonClick = () => {
        setCurrentFilmIndex(currentFilmIndex - 1);
    }

    return (
        <div className="container">
            <h1>Database of Movies on the Internet</h1>
            <Film film={films[currentFilmIndex]} />
            <button onClick={handlePreviousButtonClick}>Previous Film</button>
            <button onClick={handleNextButtonClick}>Next Film</button>
        </div>
    )

}

export default FilmContainer;