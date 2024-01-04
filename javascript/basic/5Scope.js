/**
 * 
 */

console.log("+++++++	Global Scope	+++++++");

var globalVariable = "Hello world";

function sendMessage(){
  return globalVariable; 
}
function sendMessage2(){
  return sendMessage(); 
}
console.log(sendMessage2());  

console.log("+++++++	Functional Scope	+++++++");

function awesomeFunction(){
  var a = 2;
  var multiplyByTwo = function(){
    console.log(a*2); 
  }
}

console.log(awesomeFunction());
//console.log(awesomeFunction().a);


console.log("+++++++	Block Scope	+++++++");

{
  let x = 45;
}

console.log(x);

