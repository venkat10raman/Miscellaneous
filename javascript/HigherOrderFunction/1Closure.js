/**
 * function inside a function is called closure
 * when we call outer function , it returns inner function
 * 
 * closure is created when a child function keep the environment 
 * of the parent scope even after the parent function has already executed 
 */

 function foo() {
    let b = 1;
    function inner() {
        return b;
    }
    return inner;
}
let get_func_inner = foo();

console.log(get_func_inner());


console.log("+++++++++++++++++++++++");


function foo(outer_arg) {
 
    function inner(inner_arg) {
        return outer_arg + inner_arg;
    }
    return inner;
}
let innerFn = foo(5);
 
console.log(innerFn(4));
console.log(innerFn(3));

