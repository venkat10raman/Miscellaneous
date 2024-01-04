/**
* A callback is a function that is passed as an argument to another function,
*and is called after the main function has finished its execution. 
*The main function is called with a callback function as its argument,
*and when the main function is finished, it calls the callback function to provide a result.
*/

function callbackFunction(result) {
	console.log("Result: " + result);
}

function mainFunction(callback) {
	console.log("Performing operation...");
	setTimeout(function() {
		callback("Operation complete");
	}, 1000);
}

mainFunction(callbackFunction);

console.log("+++++++++++++++++++++++++");

var numbers = [1, 2, 3, 4, 5];

function callbackFn(number) {
	console.log("Result: " + number);
}

function mainFn(callback) {
	console.log("Performing operation...");
	numbers.forEach(callback);
}

mainFn(callbackFn);
