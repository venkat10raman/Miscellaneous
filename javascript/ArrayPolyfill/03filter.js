const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function isEven(x){
	return x % 2 == 0;
}

console.log(nums.filter(isEven));

Array.prototype.customFilter = function(callback){
	let output = [];
	for(let i=0; i<this.length; i++){
		if(callback(this[i])){
			output.push(this[i]);
		}
	}
	return output;
}

console.log(nums.customFilter(isEven));