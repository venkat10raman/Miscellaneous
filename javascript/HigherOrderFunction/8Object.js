/**
 * 
 */

 class Person {
	 
	 constructor(name, age){
		 this.name = name;
		 this.age = age;
	 }
	 
	 showDetails(){
		 console.log(this.name);
	 }
 }
 
 let adam = new Person('Adam' , 33);
adam.showDetails();