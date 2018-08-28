


// UI module  ( e.g search input field )
//--------------------------------------------------------------
let searchField = document.getElementById('searchField');
//--------------------------------------------------------------


// observable stream
//--------------------------------------------------------------
let searchStream = rxjs.fromEvent(searchField, 'keyup');
//--------------------------------------------------------------


// searchService module
//--------------------------------------------------------------
let { interval } = rxjs;
let { debounce } = rxjs.operators;

searchStream
    .pipe(debounce(() => interval(3000)))
    .subscribe(e => {
        console.log('searchService module..');
        console.log(e.target.value);
    });
//--------------------------------------------------------------