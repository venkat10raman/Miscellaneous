/**
 * 
 */

 
 let parentObj = {
	name: "steve", 
	sayHi: function () { 
		console.log(this.name + " is me name " );
	}
 }
 
 let childObj = {
	name : "Tony"
 }
 
 parentObj.sayHi.apply(childObj);
 
 
 console.log("++++++++++++++++++++++");
 
 Object.prototype.myCustomApply = function(applyObj){
	 
	 //Here this will be sayHi function
	 //we are creating new key in the applyObj with name as printHi
	 //this refers to the function on which myCustomApply method is called
	 applyObj.printHi = this;
	 applyObj.printHi(applyObj);
 }
 
 parentObj.sayHi.myCustomApply(childObj);
 
 console.log("++++++++++++++++++++++");

