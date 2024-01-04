/**
 * A function is always bundled with its lexical scope forms a closure
 * 
 * Basically it is a function which returns another function
 */

 function add(){
	 let a = 4;
	 function addChild(){
		 console.log(a+5);
	 }
	 return addChild;
 }
 
 let catchAdd = add();
 console.log(catchAdd);
 catchAdd();
 