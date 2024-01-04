/**
 * 
 */

 let myArr = [1,2,3,4,5];
 let mapOutput = myArr.map( x => x*x );
 
 console.log(mapOutput);
 
 let filterOutput = myArr.filter(x => x%2 === 0);
 console.log(filterOutput);
 
 let reduceOP = myArr.reduce((accumulator, x) => accumulator*x, 1);
 console.log(reduceOP);
 
 let reduceSum = myArr.reduce((accumulator, x) => accumulator+x, 0);
 console.log(reduceSum);