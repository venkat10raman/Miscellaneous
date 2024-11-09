


let echo = async function(args){
	return args;
}

let getValue = async function(){
	const res = await echo(50);
	console.log(res);
}

getValue();



/*
Because the echo function returns a promise and the await keyword inside
the getValue function waits for this promise to fulfill before continuing 
with the program, we’re able to log the desired value to the console
*/