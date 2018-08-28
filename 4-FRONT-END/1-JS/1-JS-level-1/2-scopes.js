


/*

    scope  / current-execution-content
    -----------------------------------

    => memory/stack-frame with  args & locals
       to execute instructions in seq.

    phase-1 : creation / push

       -> any variable declated with 'var' keyword,
          always get hoist with default value ( undefined )
    
    phase-2 : execution / pop

        -> instructions executes in seq

    ---------------------------------------------

    by default,
    every javascript runtime has 1 global-scope 

    ---------------------------------------------

    imp-note :

    every function call creates new-scope,
    which is child of in which scope that function has declared/created


*/



//-------------------------------------------------
// console.log(v);
// var v=12;
//-------------------------------------------------

// var v = 12;
// function f1() {
//     console.log(v);
//     var v=13;
// }
// f1(); // f1-scope  <--- global-scope

//-------------------------------------------------


// Quiz

// var v = 12;  
// function f1() {
//     function f2() {
//         console.log(v)
//     }
//     f2(); // f2-scope <--- f1-scope
//     var v = 13; 
// }
// f1(); // f1-scope <--- global-scope


//-------------------------------------------------

// var v=12;
// var v=13;

//-------------------------------------------------

// var v=12;
// if (true) {
//     var v = 13;
// }
// console.log(v);


//-------------------------------------------------


// problems with 'var' keyword

/*

    => variables always get hoist
    => can re-declare same variables within scope
    => no 'block-scope' to variables


    soln :

    => by using 'let' & 'const' keywords with block-scope


*/


//-------------------------------------------------

// console.log(v);
// let v=12;

//-------------------------------------------------

// let v=12;
// var v=13;

//-------------------------------------------------

// var v=12;
// if (true) {
//     let v = 13;
// }
// console.log(v);


//-------------------------------------------------


// const v=100;

// const tnr={
//     name:'Nag',
//     subject:'java'
// };

// tnr.subject="js";



//-------------------------------------------------


// summary :

/*
    let   ==> for mutable reference
    const ==> for immutable reference
    var   ==> dont use
*/

