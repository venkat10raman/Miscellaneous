const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];

function additionFn(accumulator, current){
	accumulator = accumulator + current;
	return accumulator;
}

console.log(nums.reduce(additionFn));
console.log(nums.reduce(additionFn, 0));

Array.prototype.customReduce = function(callback, initialValue){
	var accumulator = initialValue === undefined ? undefined : initialValue;

	for (var i = 0; i < this.length; i++){
		if(accumulator !== undefined){
			accumulator = callback.call(undefined, accumulator, this[i], i, this);
		} else {
			accumulator = this[i];
		}
	}

	
}
