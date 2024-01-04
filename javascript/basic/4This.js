/**
 * The this keyword refers to the object that the 
 * function is a property of.
 * 
 * 
 * The value of the this keyword will always depend on 
 * the object that is invoking the function.
 */

function doSomething() {
	console.log(this);
}
   
doSomething();

/*
Since the function is invoked in the global context,
the function is a property of the global object.
*/


console.log("++++++++++++++++++++++");

var obj = {
    name:  "vivek",
    getName: function(){
    console.log(this.name);
    console.log(this);
  }
}
   
obj.getName();

/*
at the time of invocation, the getName function is a property
of the object obj , therefore, this keyword will refer to the object obj,
 and hence the output will be “vivek”.
*/

console.log("++++++++++++++++++++++");


var obj = {
    name:  "vivek",
    getName: function(){
    console.log(this.name);
  }
     
}
       
var getName = obj.getName;
       
var obj2 = {name:"akshay", getName };
obj2.getName();


/*
Although the getName function is declared inside the object obj, 
at the time of invocation, getName() is a property of obj2,
 therefore the “this” keyword will refer to obj2.

The silly way to understand the “this” keyword is, 
whenever the function is invoked, check the object before the dot. 
The value of this . keyword will always be the object before the dot.

If there is no object before the dot-like in example1, 
the value of this keyword will be the global object.
*/


console.log("++++++++++++++++++++++");


var obj1 = {
    address : "Mumbai,India",
    getAddress: function(){
    console.log(this.address); 
  }
}
   
var getAddress = obj1.getAddress;
var obj2 = {name:"akshay"};
obj2.getAddress();    

/*
The output will be an error.
Although in the code above, this keyword refers to the object obj2,
obj2 does not have the property “address”,
hence the getAddress function throws an error. 
*/