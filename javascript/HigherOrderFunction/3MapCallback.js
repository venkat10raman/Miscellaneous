/**
 * 
 */

 
Array.prototype.myFunction = function(){
	console.log(this);
	this.forEach(i => console.log(i));
}

let arr = [1,2,3,4,5];
arr.myFunction(); 

console.log("+++++++++++++++++++++++++++");

Array.prototype.myMap = function(callback){
	let newArray = [];
	this.forEach(i => newArray.push(callback(i)));
	return newArray;
}

function square(x){ return x*x}

var output = arr.myMap(square);
console.log(output);