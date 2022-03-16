const Buttons = ({onPreviousClick, onNextClick, maxFilmNumber, onFilmIndexSubmission}) => {

    return (
        <>
            <div className="button-section">
                <button onClick={onPreviousClick}>Previous</button>
                <button onClick={onNextClick}>Next</button>
            </div>
            <div className="button-section">
                <form onSubmit={onFilmIndexSubmission}>
                    <label htmlFor="film-selector">Select a film:</label>
                    <input type="number" id="film-selector" min={1} max={maxFilmNumber}/>
                    <input type="submit" value="Go to film"/>
                </form>
            </div>

        </>
    )

}

export default Buttons;