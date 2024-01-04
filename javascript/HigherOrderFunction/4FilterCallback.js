/**
 * 
 */

 let myArr = [1,2,3,4,5];
 
 function isEven(x) {return x%2 === 0}
 
 Array.prototype.myFilter = function(callback){
	 let newArray = [];
	 //let newArray = this.filter(x => callback(x));
	 this.forEach(i => {
		 if(callback(i)){
			 newArray.push(i);
		 }
	 });
	 return newArray;
 }
 
let output = myArr.myFilter(isEven);
console.log(output);