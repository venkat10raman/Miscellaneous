/**
 * 
 */

console.log("------- Primitive Types ---------")

//string
console.log(typeof "John Doe");

// number with and without decimal
console.log(typeof 8);
console.log(typeof 3.14);


//bigint
console.log(typeof 234567890123456789012345678901234567890n); 

//boolean
console.log(typeof false);
console.log(typeof true);

//undefined
console.log(typeof undefined);

// Returns "object" (kind of a bug in JavaScript)
 console.log(typeof null)

/*
Symbol - It is a new data type introduced 
in the ES6 version of javascript.
It is used to store an anonymous and unique value.
*/
console.log(typeof Symbol('venkat'));

console.log("------- Primitive Types End ---------");


var obj1 = {
   x:  43,
   y:  "Hello world!",
   z: function(){
      return this.x;
   }
};

console.log(typeof obj1);

var array1 = [5, "Hello", true, 4.1];

console.log(typeof array1);