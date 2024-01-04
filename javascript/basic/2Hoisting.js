/**
 * Hoisting for let and const
 * 
 * let and const are hoisted but not initialized.
 * Referencing the variable in the block before the
 * variable declaration results in a ReferenceError
 */

hoistedVariable = 3;
console.log(hoistedVariable);
let hoistedVariable;