
/*
For example, an alternative to creating an additional init function 
in the code 02 file would be to wrap the existing code in an IIFE, 
which we mark as async:
*/

(async () => {
	async function fetchDataFromApi() {
		console.log('Starting fetching data From fetchDataFromApi');
	    const res = await fetch('https://v2.jokeapi.dev/joke/Programming?type=single');
	    const json = await res.json();
	    console.log(json.joke);
	    console.log('Finished fetching data From fetchDataFromApi');
  	}
  
	await fetchDataFromApi();
	console.log('Finished fetching data');
})();
