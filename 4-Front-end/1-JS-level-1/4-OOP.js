


// ----------------------------------------------------------
// simple js-app
// ----------------------------------------------------------
class Trainer {
    constructor(name) {
        this.name = name;
    }
    doTeach(sub) {
        console.log(`${this.name} teaching ${sub}`);
        let notes = `${sub}-notes`;
        let doLearn = function () {
            console.log(`${this.name} learning with ${notes}`);
        }
        console.log(`teaching ends...`);
        return doLearn;
    }
}
class Employee {
    constructor(name) {
        this.name = name;
    }
    doWork() {
        console.log(this.name + " working..");
    }
}
function sessionStart() {
    const tnr = new Trainer('Nag');
    const e1 = new Employee('Jai');
    const e2 = new Employee('Mathew');
    const e3 = new Employee('Sankar');
    let learnJavaFunc = tnr.doTeach('java');
    learnJavaFunc.call(e1);
    learnJavaFunc.call(e2);
    learnJavaFunc.call(e3);
    e1.doWork();
    e2.doWork();
    e3.doWork()
}
sessionStart();