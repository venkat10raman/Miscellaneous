/**
 * 
 */

 let myArr = [1,2,3,4,5];
 
 function square(x) {return x*x}
 
 function myMapPolyfill(arr, callback){
	 let newArray = [];
	 arr.forEach(x => {
		 newArray.push(callback(x));
	 });
	 return newArray;
 }
 
 console.log(myMapPolyfill(myArr, square));