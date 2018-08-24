

console.log('-app.js-');


//------------------------------------------------------
// using DOM api
//------------------------------------------------------

let greetBox = document.querySelector('#greetBox')
let hideBtn = document.querySelector('.btn-danger');
let showBtn = document.querySelector('.btn-primary');
let greetBtn = document.querySelector('.btn-success');

hideBtn.addEventListener('click', e => {
    greetBox.style.display = 'none';
});
showBtn.addEventListener('click', e => {
    greetBox.style.display = '';
});
greetBtn.addEventListener('click', e => {
    greetBox.innerText = "greetngs from olam"
})

//------------------------------------------------------
// using Timer API
//------------------------------------------------------

let startBtn = document.querySelector('#startBtn')
let stopBtn = document.querySelector('#stopBtn')
let imgEle = document.querySelector('img');

stopBtn.setAttribute('disabled', true)

startBtn.addEventListener('click', e => {
    startBtn.setAttribute('disabled', true)
    stopBtn.removeAttribute('disabled');
    let idx = 0;
    let interval = setInterval(() => {
        idx++
        let imagePath = `./images/${idx}.jpeg`;
        imgEle.src = imagePath;
        if (idx === 5) idx = 0;
    }, 1000);

    stopBtn.addEventListener('click', e => {
        clearInterval(interval);
        startBtn.removeAttribute('disabled');
        stopBtn.setAttribute('disabled', true)
    });

})








//------------------------------------------------------
// using XHR / Fetch api
//------------------------------------------------------

let todosTable = document.querySelector('#todosTable');
function loadTodos(count) {
    let apiUrl = `https://jsonplaceholder.typicode.com/todos?_limit=${count}`
    let rows = [];
    let promise = fetch(apiUrl); // IO 
    promise
        .then(response => response.json())
        .then(todos => {
            todos.forEach(todo => {
                let row = `
                     <tr class='${todo.completed ? 'bg bg-success' : ''}'>
                         <td>${todo.id}</td>
                         <td>${todo.title}</td>
                         <td>${todo.completed}</td>
                         <td>${todo.userId}</td>
                     </tr>
                 `;
                rows.push(row);
            });
            todosTable.innerHTML = rows.join(" ");
        })
}
let todosBtn = document.querySelector('.btn-dark');
let todosCount = document.querySelector('#todos-count');
todosBtn.addEventListener('click', e => {
    loadTodos(todosCount.value);
})
todosCount.addEventListener('change', e => {
    loadTodos(todosCount.value);
})



//-------------------------------------------------------------
// jQuery
//-------------------------------------------------------------

$('#fromDP').datepicker();
$('#toDP').datepicker();

$('.btn-warning').click(()=>{
    $('table').toggle();
})
