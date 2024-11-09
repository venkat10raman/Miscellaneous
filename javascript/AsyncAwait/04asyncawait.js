
/*
async/await is, to a large extent, syntactic sugar for promises

The first thing to be aware of is that an async function will 
always return a promise,  even if we don’t explicitly tell it to do so
*/


let echo = async function(arg){
	return arg;
}

const res = echo(5);
console.log(res);