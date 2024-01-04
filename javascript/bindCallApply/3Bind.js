/**
 * binding returns an function 
 */

 
 
 let parent = {
	 name : "Steave",
	 sayHi : function() {
		 
		 //Here this is the object
		 //which is passed as an argument
		 //on bind method call
		 console.log(this.name)
	 }
 }
 
 let child = {
	 name : "Tony"
 }
 
 let hiFun = parent.sayHi.bind(child);
 hiFun();
 
 console.log("++++++++++++++++++++++")
 
 Object.prototype.myBind = function(bindObj){
	 
	 //Here this will be sayHi function
	 //we are creating new key in the bindObj with name as printHi
	 //this refers to the function on which myBind method is called
	 bindObj.printHi = this;
	 
	 return function(){
		 bindObj.printHi();
	 }
 }
 
let printHey = parent.sayHi.myBind(child);
printHey();
console.log("++++++++++++++++++++++")
 