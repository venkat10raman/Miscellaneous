/**
 * 
 */



let parentObj = {
	name: "steve", 
	sayHi: function (age) { 
		console.log(this.name + " age is " + age);
	}
}


let childObj = {
	name : "Tony"
}


parentObj.sayHi.call(childObj, 42);



console.log("++++++++++++++++++++++");
 
 
 
 Object.prototype.myCustomCall = function(callObj, ...args){
	 
	 //Here this will be sayHi function
	  //we are creating new key in the callObj with name as printHi
	 //this refers to the function on which myCustomCall method is called
	 callObj.printHi = this;
	 callObj.printHi(...args);
	 callObj.printHi(args);
 }
 
 parentObj.sayHi.myCustomCall(childObj, 58);
 
 console.log("++++++++++++++++++++++")