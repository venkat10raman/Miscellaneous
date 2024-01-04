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

parentObj.sayHi.apply(childObj, [58]);



console.log("++++++++++++++++++++++");

Object.prototype.myCustomApply = function(applyObj, ...args){
	
	//Here this will be sayHi function
	 //we are creating new key in the applyObj with name as printHi
	 //this refers to the function on which myCustomApply method is called
	applyObj.printHi = this;
	applyObj.printHi(args);
	applyObj.printHi(...args);
}

parentObj.sayHi.myCustomApply(childObj, [89]);
console.log("++++++++++++++++++++++");