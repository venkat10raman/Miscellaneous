/**
 * 
 */

 function car(brand, model, color){
	this.brand = brand;
	this.model = model;
	this.color = color;
	
	this.drive = function(){
		console.log("I am driving " + this.model);
		console.log("brand ::: " + this.brand);
		console.log("color ::: " + this.color);
	}
 }
 
let bmw = new car('BMW' , 'acute' , 'white');
let ford = new car('Ford' , 'jumpo' , 'brown');

console.log(bmw.drive());
console.log(ford.drive());