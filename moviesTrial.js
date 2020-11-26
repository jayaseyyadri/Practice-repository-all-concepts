$(document).ready(function (){


// functions for 1. adding 2. editing 3. deleting

    function movieFetchRequest(){
        var moviesObject=fetch('https://tide-opalescent-sled.glitch.me/movies');
        moviesObject.then((response)=> response.json())
            .then( (data)=>{
                console.log(data);
            })
            // .then( response => console.log(response) ) /* review was created successfully */
            .catch( error => console.error(error) ); /* handle errors */
    }
    console.log(movieFetchRequest());

// function add a movie

    function addMovie() {
        const addNewMovie = {
            actors: 'Chris Hemsworth, Robert Jnr.',
            directors: "Joss Whedon",
            genre: "Fantasy",
            id: 5,
            plot: "Superheros fight bad guys",
            poster: "",
            rating: 5,
            title: 'Avengers',
            year: "2012"
        };
        const url = 'https://tide-opalescent-sled.glitch.me/movies';
        const options = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(addNewMovie),

        };


    }



//    ending document.ready
});