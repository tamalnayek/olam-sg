

// olam-service module
//----------------------------------------------------
let olamCookieService = {
    getCookie() {
        let promise = new Promise((resolve, reject) => {
            setTimeout(() => {
                console.log('cookies ready..');
                resolve('COOKIES..');
            }, 3000)
        });
        return promise;
    }
}


//----------------------------------------------------


// olam-service module
//----------------------------------------------------
let olamCoffeeService = {
    getCoffee() {
        let promise = new Promise((resolve, reject) => {
            setTimeout(() => {
                console.log('in coffee machine');
                setTimeout(() => {
                    //console.log('coffee ready..');
                    //resolve('CAPI...');
                    console.log('cofee not ready');
                    reject('No Millk');
                }, 3000)
            }, 2000);
        });
        return promise;
    }
};

//----------------------------------------------------

// employee module
//----------------------------------------------------

let employee = {
    doWork() {
        console.log("employee working...");
        console.log("employee needs coffee..& requesting..");
        let promise1 = olamCoffeeService.getCoffee();
        let promise2 = olamCookieService.getCookie();
        console.log('employee got promise..defer my actions to future');
        let newPromise = Promise.race([promise1, promise2]).then((result) => {
            console.log('yummy ' + result);
            return "HALF COOKIES";
        }, (error) => {
            console.log('oops ' + error);
        });

        newPromise.then(result => {
            console.log(result);
        });

        console.log('employee cont..with further work...');
    }
};

employee.doWork();
//----------------------------------------------------