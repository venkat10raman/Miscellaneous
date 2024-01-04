/**
 * Hoisting is the default behaviour of javascript 
 * where all the variable and function declarations are moved on top.
 * 
 * This means that irrespective of where the variables
 * and functions are declared, they are moved on top of the scope.
 * The scope can be both local and global.
 */

 
hoistedVariable = 3;
console.log(hoistedVariable); 
// outputs 3 even when the variable is declared after it is initialized	
var hoistedVariable;


hoistedFunction();
function hoistedFunction(){ 
  console.log("Hello world! ");
}


// Hoisting takes place in the local scope as well
function doSomething(){
  x = 33;
  console.log(x);
  var x;
} 

doSomething();



/*
*Variable initializations are not hoisted, 
*only variable declarations are hoisted
*/

var x;
console.log(x); 
// Outputs "undefined" since the initialization of "x" is not hoisted
x = 23;