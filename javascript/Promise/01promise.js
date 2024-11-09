


const promise = new Promise((resolve, reject) => {
	const request = new XMLHttpRequest();
	request.open('GET', 'https://icanhazdadjoke.com/');
	request.setRequestHeader('Accept', 'application/json');
	
	request.onload = () => {
	    if (request.status === 200) {
	      resolve(request.response); // we got data here, so resolve the Promise
	    } else {
	      reject(Error(request.statusText)); // status is not 200 OK, so reject
	    }
  	};
  	
  	request.onerror = () => {
    	reject(Error('Error fetching data.')); // error occurred, reject the  Promise
  	};
  	
  	request.send(); // send the request
  	
});



promise.then((data) => {
	console.log(JSON.parse(data).joke);
	console.log('Got data! Promise fulfilled.');
}, (error) => {
	console.error('Promise rejected.');
	console.error(error.message);
});