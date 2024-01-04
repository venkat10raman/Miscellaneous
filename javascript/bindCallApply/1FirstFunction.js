/**
 * open terminal and go to js file directory
 * node fileName.js
 */

 function sayHello(name){
	 console.log("Hello ::: ", name);
 }
 
 sayHello();
 console.log(sayHello(10));
 console.log(sayHello("Mate"));
 
/* 
Functions can be treated as variables
Functions are first class citizens
*/

let program = function sayHello(){
	console.log("I am an expression");
}


program();

program = function (){
	console.log("I am an expression");
	console.log("I am also anonymous");
}

program();

/*
IIFE -> Immediately Invoked Function Expression
require pollution closure
*/

(function fn(){
	console.log("I am an IIFE");
	console.log("I will run on my own");
})();


/*Arrow function*/

let arrowFn = (num) => {return num * num};
arrowFn = num => num * num;
console.log(arrowFn(10));
 