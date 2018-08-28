
console.log('-main.js-');

require('./css/theme.css');
let greetMod = require('olam-greet-sg');


greetMod.greet();
greetMod.greet('en');
greetMod.greet('es');

console.log("---------------------------------------------")

// import { item1, item2 } from './hotel/menu';

// console.log(item1.name);
// console.log(item1.price);

// console.log(item2.name);
// console.log(item2.price);


//---------------------------------------------

// import { item1 as fav, item2 as kor } from './hotel/menu';

// console.log(fav.name);
// console.log(fav.price);

// console.log(kor.name);
// console.log(kor.price);

//---------------------------------------------

// import * as items from './hotel/menu';

// console.log(items.item1.name);
// console.log(items.item2.price);

//---------------------------------------------

// import {item1} from './hotel/menu';
// // item1=null; // error
// item1.price=100;

// console.log(item1.price)

//---------------------------------------------

import primaryItem, { secondaryItem1, secondaryItem2 } from './hotel/menu';


console.log("---------------------------------------------")




let v = 12;
v = "string"
v = true