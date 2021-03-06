"use strict"

/*

Functional Programming
----------------------

    ==> solving problems thru functions

    ----------------------------------------------------------
    FP principles:

        - A function can be stored in a variable or value
        - A parameter of a function can be a function
        - The return value of a function can be a function
        
    ----------------------------------------------------------
    How to create/declare function .js-lang ?

    2 ways

    way-1 : function declaration

            => Named function
            => func-obj created ate scope-creation phase
            => always get hoist with func-obj

    way-2 : function expression

            => anonymous function
            => func-obj created ate scope-execution phase
            => we can invoke after expression

     ----------------------------------------------------------
*/

// ----------------------------------------------------------
// way-1 : function declaration
// ----------------------------------------------------------
// console.log(add(12,13))
// function add(n1, n2) {
//     return n1 + n2;
// }
// console.log(add(12,13))


// ----------------------------------------------------------
// way-2 : function expression
// ----------------------------------------------------------
// console.log(add(12,13)) // error
// let add=function(n1,n2){
//     return n1+n2;
// }
// console.log(add(12,13))

// ----------------------------------------------------------

// e.g

// let userAction;
// let userType='guest';

// function login(){
//     //..
//     userType="admin";
// }
// login();

// if(userType==='guest'){
//     userAction=function(){
//         console.log('guest user func()..');
//     }
// }
// if(userType==='admin'){
//     userAction=function(){
//         console.log('admin user func()..');
//     }
// }
// userAction();

// ----------------------------------------------------------
// function with params
// ----------------------------------------------------------

/*
    
    => function-params are optional

*/

// function func(a,b,c){
//     console.log(arguments);
// }
// func(10,20,30);


// e.g  function can return sum of n numbers

// function sum() {
//     let len = arguments.length,
//         result = 0,
//         i = 0;
//     while (i < len) {
//         result = result + arguments[i];
//         i++;
//     }
//     return result;
// }


// Quiz

// can we overload functions in .js-lang ? No

// function getFood(){
//     return "No Food";
// }

// function getFood(pay){
//     if(arguments.length===0)return "No Food"
//     return "biryani";
// }

// console.log(getFood(5));



// ----------------------------------------------------------
// function with default params
// ----------------------------------------------------------


// function func(a = 1, b = 2) {
//     console.log(a);
//     console.log(b);
// }
// func(undefined,20);



// ----------------------------------------------------------
// function with rest param
// ----------------------------------------------------------

// function func(a, b, ...rest) {
//     console.log(a);
//     console.log(b);
//     console.log(rest);
// }
// func(1, 2, 3, 4, 5, 6, 7, 8, 9);


// ----------------------------------------------------------
// principle-1: A function can be stored in a variable or value
// ----------------------------------------------------------

// function greet() {
//     console.log('hello..');
// }

// let sayHello = greet;
// sayHello();

// ----------------------------------------------------------
// principle-2: A parameter of a function can be a function
// ----------------------------------------------------------

// function greet(f) {
//     if (f) {
//         f(); return;
//     }
//     console.log('hello');
// }

// greet();
// let tnGreet = function () {
//     console.log('vanakkam');
// }
// greet(tnGreet);


// // e.g

// let nums = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10]


// //  style-1 : imperative style  ( How + what )

// // loop
// // compare
// // swap

// // step-2 : functional style  ( what )

// nums.sort();
// let asc = function (a, b) { return a - b; }
// let desc = function (a, b) { return b - a; }
// nums.sort(desc);

// console.log(nums);


// ----------------------------------------------------------
// principle-3 : The return value of a function can be a function
// ----------------------------------------------------------

// function teach() {
//     console.log('teaching....');
//     let learn = function () {
//         console.log('learning...');
//     };
//     //learn();
//     console.log('teaching....ends');
//     return learn;
// }

// let learnFunc=teach();
// learnFunc()
// learnFunc()
// learnFunc();

// ----------------------------------------------------------
//  javascript function-closures
// ----------------------------------------------------------
/*
    A closure is a function having access to the parent scope, 
    even after the parent function has closed.
*/

// function teach(sub) {
//     console.log('teaching ' + sub);
//     let notes = sub + "-notes";
//     function learn() {
//         console.log('learning with ' + notes);
//     }
//     //learn();
//     console.log('teaching ends..');
//     return learn;
// }

// let learnFunc = teach('.js');

// learnFunc();
// learnFunc();

/*

    // why/where we need closures?

    => to abstract public behav of any module to other modules

    // e.g counter module

        - count
        - doCount()
        - getCount()


*/

// self executable function

// const counter = (function () {
//     let count = 0; // private
//     // public
//     function doCount() {
//         count++;
//     }
//     function getCount() {
//         return count;
//     }
//     return {
//         inc: doCount,
//         get: getCount
//     };
// })();




// ----------------------------------------------------------
//  function binding   ( i.e executing function with object )
// ----------------------------------------------------------

/*

    1. static function-binding
    2. dynamic function-binding

*/

// ----------------------------------------------------------
// 1. static function-binding
// ----------------------------------------------------------


// let person1 = {
//     name: 'Nag',
//     sayName: function () {
//         console.log(`im ${this.name}`);
//     }
// };
// let person2 = {
//     name: 'Jai',
//     sayName: function () {
//         console.log(`im ${this.name}`);
//     }
// };


function sayNameForAll() {
    console.log(`im ${this.name}`);
}

let person1 = {
    name: 'Nag',
    sayName: sayNameForAll // static function binding
};
let person2 = {
    name: 'Jai',
    sayName: sayNameForAll
};
// sayNameForAll(); // im ??  // error becox here function not bound to any person
person1.sayName(); // im Nag
person2.sayName(); // im Jai



// ----------------------------------------------------------
// 2. dynamic function-binding
// ----------------------------------------------------------


let e1 = { name: 'Mathew' }
let e2 = { name: 'sankar' }


let tng = {
    learnJava: function () {
        console.log(this.name + " learning java");
    }
};

// e1.learnJava = tng.learnJava;// static function-binding
// e1.learnJava();

// tng.learnJava.call(e1); // dynamic function binding
// tng.learnJava.call(e2);


// ----------------------------------------------------------
// simple js-app
// ----------------------------------------------------------
function Trainer(name) {
    this.name = name;
    this.doTeach = function (sub) {
        console.log(`${this.name} teaching ${sub}`);
        let notes = `${sub}-notes`;
        let doLearn = function () {
            console.log(`${this.name} learning with ${notes}`);
        }
        console.log(`teaching ends...`);
        return doLearn;
    }
}
function Emploee(name) {
    this.name = name;
}
function sessionStart() {
    const tnr = new Trainer('Nag');
    const e1 = new Emploee('Jai');
    const e2 = new Emploee('Mathew');
    const e3 = new Emploee('Sankar');
    let learnJavaFunc = tnr.doTeach('java');
    learnJavaFunc.call(e1);
    learnJavaFunc.call(e2);
    learnJavaFunc.call(e3);
}
sessionStart();