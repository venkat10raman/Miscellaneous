/**
 * 
 */

 
 
 let parentObj = {
	 name : "Steave",
	 sayHi : function() {
		 
		 //Here this is the object
		 //which is passed as an argument
		 //on bind method call
		 console.log(this.name)
	 }
 }
 
  let childObj = {
	 name : "Mate"
 }
 
 parentObj.sayHi.call(childObj);
 
 
 
  console.log("++++++++++++++++++++++")
  
  Object.prototype.myCustomCall = function(callObj){
	  
	  //Here this will be sayHi function
	  //we are creating new key in the callObj with name as printHi
	 //this refers to the function on which myCustomCall method is called
	  callObj.printName = this;
	  callObj.printName();
	  
  }
  
  parentObj.sayHi.myCustomCall(childObj);
  
  console.log("++++++++++++++++++++++")