

let { Subject } = require('rxjs');


// step-1 : create observable-stream 
let jsStream = new Subject();



// module-1
jsStream.subscribe((event) => {
    console.log('module-1: subscribing ' + event);
}, (error) => {
    console.log('module-1: ' + error);
}, () => {
    console.log('module-1: received complete signal');
});

// module-2
jsStream.subscribe((event) => {
    console.log('module-2: subscribing ' + event);
}, (error) => {
    console.log('module-2: ' + error);
}, (complete) => {
    console.log('module-2: received complete signal');
});


// module-n
let i = 0;
let interval = setInterval(() => {
    i++;
    console.log('emitting new topic');
    jsStream.next(`topic-${i}`);
    if (i === 3) {
        jsStream.error('something bad happened..');
    }
    if (i === 5) {
        jsStream.complete();
        clearInterval(interval)
    }
}, 1000);
