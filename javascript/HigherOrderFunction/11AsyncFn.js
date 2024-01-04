/**
 * Async simply allows us to write promises-based code as if it was
 * synchronous and it checks that we are not breaking the execution thread.
 * 
 * Async functions will always return a value. It makes sure that a promise is
 * returned and if it is not returned then JavaScript automatically wraps it in a
 * promise which is resolved with its value.
 */

 const getData = async() => {
	 let data = "Hello Mate";
	 return data;
 } 
 
 getData().then(data => console.log(data));
 
 
 
 /*
 *Await function is used to wait for the promise. 
 *It could be used within the async block only.
 *
 *It makes the code wait until the promise returns a result.
 *
 */

 
 const getDataTwo = async() => {
	 let data = await "Hello Mate from await";
	 console.log(data);
 }
 
 
 console.log(1);
 getData();
 getDataTwo().then(data => console.log(data));
 console.log(2);
 
 
 function asynchronous_operational_method(){
	 let first_promise = new Promise(
		 (resolve, reject) => resolve("first_promise"));
	 let second_promise = new Promise((resolve, reject) => {
		 setTimeout(()=> {resolve("second_promise")}, 1000)
	 });
	 
	 let combine_promise = 
	 	Promise.all([first_promise, second_promise]);
 	 return combine_promise;
 }
 
 async function display(){
	let data = await asynchronous_operational_method();
    console.log(data);
 }
 
 display();