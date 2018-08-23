



/*
    data-types
    ----------------------
    1. simple/primtives   ==> values
        a. undefined
        b. string
        c. number
        d. bolean
    2. complex/reference  ==> objects

*/


//----------------------------------------------------------------------
// 1. simple/primtives   ==> values
//----------------------------------------------------------------------


//----------------------------------------------------------------------
//a. undefined
//----------------------------------------------------------------------

var v;

//----------------------------------------------------------------------
// b. string
//----------------------------------------------------------------------

var name = "olam"
var selection = 'abc'
var dynamicString1 = 'the company ' + name
//or ( use string interpolation for dynamic string )
var dynamicString2 = `the company ${name} in singapore`;
var arith = `the sum of 1 and 2 is ${1 + 2}`
var multiLineString1 = "line 1"
    + "line-2"
    + "line-3"
// or                     
var multiLineString2 = `
                     line-1
                     line-2
                     line-3   
`
var template = `
    <div>
        <ul>
            <li>coffee</li>
            <li>grains</li>
        </ul>
    </div>
`

//----------------------------------------------------------------------
// c. number
//----------------------------------------------------------------------

var count = 12;
var cost = 12.12;


//----------------------------------------------------------------------
// d. boolean
//----------------------------------------------------------------------


var found = true;

// imp-note : falsy values
// ==> false,0,"",undefined,null,NAN

// Ref : https://dorey.github.io/JavaScript-Equality-Table/





//----------------------------------------------------------------------
// 2. complex/reference   ==> objects
//----------------------------------------------------------------------

/*
    how to create object in .js-lang ?
    
    syntax:
        var ref=new Constructor();


    imp-note :
    
    ==> all js objects are extensible & configurable
        i.e we can add/remove property as we need


*/

// // class/constructor ( es5 )

// function Person(name, age) {
//     this.name = name;
//     this.age = age;
// }

// // class/constructor ( es6 )
class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}

var p1 = new Person('Nag', 34);
var p2 = new Person('olam', 100);

p1.address = "singapore";  // new property added dynamically 
delete p1.address;



//----------------------------------------------------------------------
// literal-style objects
//----------------------------------------------------------------------

//----------------------------------------------------------------------
// a. Object
//----------------------------------------------------------------------

var config = new Object();
config.url = "http://localhost:8080/api/products";
config.httpMethod = "GET";
config.onSuccess = function () {
    console.log('im running on success');
}
// or

var newConfig = {
    url: "http://localhost:8080/api/products",
    httpMethod: 'GET',
    onSuccess: function () {
        console.log('im running on success');
    }
};

//----------------------------------------------------------------------
// b. Array / List
//----------------------------------------------------------------------

var menu = new Array();
menu[0] = 'biryani';
menu.push('meals');

// or

var newMenu = ["item-1", "item-2"];


//----------------------------------------------------------------------
// c. RegExpression
//----------------------------------------------------------------------

var mobilePattern = new RegExp('\\d{8}')

// or

var adharPattern = /\d{4}-\d{4}-\d{4}/;



//----------------------------------------------------------------------
// d. Function
//----------------------------------------------------------------------


var add = new Function("n1", "n2", "var r=n1+n2;return r;");

// or

function addFunc(n1, n2) {
    var r = n1 + n2;
    return r;
}



//----------------------------------------------------------------------
// How to access obj properties?
//----------------------------------------------------------------------

/*

    2 ways

    ==> '.' notation

    else

    ==> '[]' notation if property having '-' or space

*/

var person = {
    name: 'Nag',
    'home-address': 'chennai',
    123: "one two threee"
};

person.name = "Nag N";
console.log(person.name);

person["home-address"] = "bengalore";
console.log(person["home-address"])

console.log(person[123]);