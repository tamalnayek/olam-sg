"use strict"

//----------------------------------------------------------
// - obj-literal enhancements
//----------------------------------------------------------

// let name = "Nag";
// let age = 34

// // ES5
// var person1 = {
//     name: name,
//     age: age,
//     address: 'india',
//     sayName: function () {
//         //..
//     }
// };
// // ES6
// let addressType = 'office'; // home / office vacation/
// let person2 = {
//     name,
//     age,
//     [addressType + "-address"]: '......',
//     sayName() {
//         //..
//     }
// };



//----------------------------------------------------------
// - destructuring
//----------------------------------------------------------


// A. object destructuring

// let person = {
//     name: 'Nag',
//     age: 34
// };


// // let myName = person.name;
// // let myAge = person.age;

// // or

// let { name: myName, age: myAge } = person;
// // let { name: name, age: age } = person;
// // or
// let { name, age } = person;


// //B. array destructuring


// let nums = [10, 20, 30, 40, 50, 60, [70, 80]];

// // let n1=nums[0];
// // let n2=nums[1];
// // let n3=nums[2];

// // or

// let [n1, n2, n3, n4 = 400, , n6, [n7, n8]] = nums;



//----------------------------------------------------------
// - spread operator
//----------------------------------------------------------



// function func(a, b, c, d) {
//     console.log(a);
//     console.log(b);
//     console.log(c);
// }

// let nums = [10, 20, 30, 40, 50, 60];
// // func(nums[0], nums[1], nums[2]);
// // or
// func(...nums)



// let arr1 = [1, 2, 3]
// let arr2 = [7, 8, 9];

// let arr3 = [...arr1, 4, 5, 6, ...arr2];



//----------------------------------------------------------
// - arrow-function
//----------------------------------------------------------



// let getPrice = function () {
//     return 100 + 200;
// }


// or


// let getPrice = () => {
//     return 100 + 200;
// }

// let getPrice = (count) => {
//     return count * (100 + 200);
// }
// or
// let getPrice = count => {
//     return count * (100 + 200);
// }


// let getPrice = (count, tax) => {
//     return count * (100 + 200) + tax;
// }
// or
//let getPrice = (count, tax) => count * (100 + 200) + tax;


// let getPrice = (count, tax) => {
//     let cost = count * (100 + 200);
//     let total = cost + tax;
//     return total;
// }



// why / where we need arrow-function ?

/*

    ==> to compact function-argument
    ==> to capture 'this'

*/

// ==> to compact function-argument

// let nums = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10];
// // nums.sort(function (a, b) { return a - b; });
// // or
// // nums.sort((a, b) => { return a - b; });
// // or
// nums.sort((a, b) => a - b);
// console.log(nums);


// ==> to capture 'this'

// let tnr = {
//     name: 'Nag',
//     doTeach: function () {
//         console.log(this.name + " teaching .js");
//         // let askQues = function (q) {
//         //     console.log(this.name + " answering " + q)
//         // }
//         // or
//         let askQues = (q) => {
//             console.log(this.name + " answering " + q)
//         }
//         console.log('teaching ends');
//         return askQues;
//     }
// }

// let askQues = tnr.doTeach();
// askQues("Q1"); 