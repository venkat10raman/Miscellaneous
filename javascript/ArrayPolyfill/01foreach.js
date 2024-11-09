const names = ["ali", "hamza", "jack"];
function consoleFunc(x) {
   console.log(x);
}
names.forEach(consoleFunc);


Array.prototype.customForEach = function(callback){
	for (let i = 0; i < this.length; i++) {
		callback(this[i]);
	}
}

names.customForEach(consoleFunc);


console.log("-----------------------");

