/**
 * JavaScript Promise are easy to manage when dealing 
 * with multiple asynchronous operations
 *
 *fulfilled: Action related to the promise succeeded
 *rejected: Action related to the promise failed
 *pending: Promise is still pending i.e. not fulfilled or rejected yet
 *settled: Promise has been fulfilled or rejected
 */

 let promiseOne = new Promise(function(resolve, reject){
	 const x = "venkat";
	 const y = "venkat";
	 if(x === y){
		 resolve();
	 } else {
		 reject();
	 }
 });
 
 promiseOne.then(function(){
	 console.log('Success, You are a GEEK Mate');
 }).catch(function(){
	 console.log('Some error has occurred');
 }).finally(function(){
	 console.log("Hey mate I am from finally");
 });
 
 
 
 console.log("--------------------------------");
 
 let promiseTwo = new Promise(function(resolve, reject){
	 resolve('Geeks For Geeks');
 });
 
 promiseTwo.then(function(successMessage){
	 console.log(successMessage);
 }).catch(function(errorMessage){
	 console.log(errorMessage);
 }).finally(function(){
	 console.log("Hey mate I am from finally");
 });
 console.log("--------------------------------");
 
 let promiseThree = new Promise(function(resolve, reject){
	reject('Promise Rejected'); 
 });
 
 promiseThree.then(function(successMessage){
	 console.log(successMessage);
 }).catch(function(errorMessage){
	 console.log(errorMessage);
 }).finally(function(){
	 console.log("Hey mate I am from finally");
 });