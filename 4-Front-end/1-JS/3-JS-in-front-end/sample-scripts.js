





//1.

// function foo(b) {
//     var a = 10;
//     return a + b + 11;
// }

// function bar(x) {
//     var y = 3;
//     return foo(x * y);
// }

// console.log(bar(7)); //returns 42


//2.

// function foo(){}
// function bar(){foo()}
// function baz(){bar()}
// baz();


//3.

// function foo(){throw new Error('oops')}
// function bar(){foo()}
// function baz(){bar()}
// baz();

// 4.

// function foo(){
//     foo()
// }
// foo();


// 5.

// function longRunning() {
//     var i = 0;
//     while (i < 10) {
//         console.log('im long....');
//         i++;
//     }
// }
// function shortRunning() {
//     console.log('short..');
// }

// longRunning();
// shortRunning();


// 6.


/*

    <button class="veg">Veg-1</button>
    <button class="veg">Veg-2</button>
    <button class="non-veg">Non-Veg</button>

*/


console.log('initial script.....')

$.on('.veg', 'click', function vegHandler(e) {
    console.log('handling event on veg elements');
});

$.on('.non-veg', 'click', function nonVegHandler(e) {
    console.log('handling event on non-veg elements');
});

function longRunning() {
    var i = 0;
    while (i < 10) {
        console.log('im long....');
        i++;
    }
}
longRunning();

console.log('cont..with other work..');


// 7.  ( non-blocking  IO)


console.log('initial script..');

// IO  ( e.g n/w call )
setTimeout(function timeout(){
    console.log('after timeout...');
},5000);

console.log('cont..with other work..');

