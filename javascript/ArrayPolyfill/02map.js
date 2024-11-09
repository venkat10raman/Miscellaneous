const users = [1, 2, 3, 4, 5];

function double(x){
	return x + x;
}

const newUsers = users.map(double);
console.log(newUsers);


function square(x){
	return x * x;
}

Array.prototype.customMap = function(callback){
	const newArray = [];
	for(let i=0; i < this.length ; i++){
		newArray.push(callback(this[i]));
	}
	return newArray;
}

console.log(users.customMap(square));