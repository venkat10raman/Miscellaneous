
//https://www.sitepoint.com/javascript-async-await/

/*
This is because we can’t use await outside of an async function 
in a non-module script, for now the easiest way to solve the problem
is by wrapping the calling code in a function of its own,
which we’ll also mark as async
*/

async function fetchDataFromApi(){
	console.log('Finished fetching data From fetchDataFromApi');
	const res = await fetch('https://v2.jokeapi.dev/joke/Programming?type=single');
	const json = await res.json();
	console.log(json.joke);
}

async function init(){
	await fetchDataFromApi();
	console.log('Finished fetching data');
}


init();

