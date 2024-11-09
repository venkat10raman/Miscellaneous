
/*
Async function expression
A function expression is when we create a function 
and assign it to a variable. 
The function is anonymous, which means it doesn’t have a name

*/

const fetchDataFromApi = async function() {
	console.log('Starting fetching data From fetchDataFromApi');
	const res = await fetch('https://v2.jokeapi.dev/joke/Programming?type=single');
  	const json = await res.json();
  	console.log(json.joke);
  	console.log('Finished fetching data From fetchDataFromApi');
}

const init = async function(){
	await fetchDataFromApi();
}

init();