/**
 * 
 */

 let parentObj = {
	 name : "Steave",
	 sayHi: function(age){
		 
		 //Here this is the object
		 //which is passed as an argument
		 //on bind method call
		 console.log(this.name + " age is :: " + age);
	 }
 }
 
 let childObj = {
	 name : "Mate"
 }
 
 let hiFun = parentObj.sayHi.bind(childObj, 42);
 hiFun();
 
 console.log("++++++++++++++++++++++")
 
 Object.prototype.myCustomBind = function(bindObj, ...args){
	 
	 //Here this will be sayHi function
	 //we are creating new key in the bindObj with name as printHi
	 //this refers to the function on which myCustomBind method is called
	 bindObj.printHi = this;
	 
	 return function(){
		 //both will work
		 bindObj.printHi(...args);
		 bindObj.printHi(args);
	 }
 }
 
 let printHey = parentObj.sayHi.myCustomBind(childObj, 42);
 printHey();
 
  console.log("++++++++++++++++++++++")