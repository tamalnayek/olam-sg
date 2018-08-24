



function teach() {
    let tnrName = "Nag";
    try {
        console.log(tnrName + ' teaching .js');
        //throw new Error('hate .js');
        setTimeout(function () {
            console.log(tnrName + ' teaching NG');
            //throw new Error('hate NG');
            console.log('teaching NG ends');
        }, 5000)
        console.log('teachig .js ends');
    } catch (e) {
        console.log('Error-' + e.message);
    }
}
teach();