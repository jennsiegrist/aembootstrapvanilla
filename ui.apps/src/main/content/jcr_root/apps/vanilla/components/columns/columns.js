/* global use */
use(function () {
    var grid = [];

    var firstParLayout = {};
    var secondParLayout = {};
    var thirdParLayout = {};
    var fourthParLayout = {};
    var parentClass = '';

    switch (this.selection) {
    case '50':
        firstParLayout = { class: 'col-sm-10 col-md-8 col-lg-6' };
        parentClass = { class: 'justify-content-center' };
        break;
    case '58':
        firstParLayout = { class: 'col-sm-10 col-md-9 col-lg-7' };
        parentClass = { class: 'justify-content-center' };
        break;
    case '66':
        firstParLayout = { class: 'col-md-10 col-lg-8' };
        parentClass = { class: 'justify-content-center' };
        break;
    case '83':
        firstParLayout = { class: 'col-md-10' };
        parentClass = { class: 'justify-content-center' };
        break;
    case '100':
        firstParLayout = { class: 'col' };
        parentClass = { class: 'justify-content-center' };
        break;
    case '25-75':
        firstParLayout = { class: 'col-md-4 col-lg-3 order-md-1 ' + this.column1Order };
        secondParLayout = { class: 'col-md-8 col-lg-9 order-md-2 ' + this.column2Order };
        break;
    case '75-25':
        firstParLayout = { class: 'col-md-8 col-lg-9 order-md-1 ' + this.column1Order };
        secondParLayout = { class: 'col-md-4 col-lg-3 order-md-2 ' + this.column2Order };
        break;
    case '33-66':
        firstParLayout = { class: 'col-md-5 col-lg-4 order-md-1 ' + this.column1Order };
        secondParLayout = { class: 'col-md-7 col-lg-8 order-md-2 ' + this.column2Order };
        break;
    case '66-33':
        firstParLayout = { class: 'col-md-7 col-lg-8 order-md-1 ' + this.column1Order };
        secondParLayout = { class: 'col-md-5 col-lg-4 order-md-2 ' + this.column2Order };
        break;
    case '33-33-33':
        firstParLayout = { class: 'col-md-4 order-md-1 ' + this.column1Order };
        secondParLayout = { class: 'col-md-4 order-md-2 ' + this.column2Order };
        thirdParLayout = { class: 'col-md-4 order-md-3 ' + this.column3Order };
        break;
    case '25-50-25':
        firstParLayout = { class: 'col-md-3 order-md-1 ' + this.column1Order };
        secondParLayout = { class: 'col-md-6 order-md-2 ' + this.column2Order };
        thirdParLayout = { class: 'col-md-3 order-md-3 ' + this.column3Order };
        break;
    case '25-25-25-25':
        firstParLayout = { class: 'col-sm-6 col-lg-3 order-md-1 ' + this.column1Order };
        secondParLayout = { class: 'col-sm-6 col-lg-3 order-md-2 ' + this.column2Order };
        thirdParLayout = { class: 'col-sm-6 col-lg-3 order-md-3 ' + this.column3Order };
        fourthParLayout = { class: 'col-sm-6 col-lg-3 order-md-4 ' + this.column4Order };
        break;
    default:
        firstParLayout = { class: 'col-md-6 order-md-1 ' + this.column1Order };
        secondParLayout = { class: 'col-md-6 order-md-2 ' + this.column2Order };
    }

    grid.push(firstParLayout);

    if (JSON.stringify(secondParLayout).length !== 2) {
        grid.push(secondParLayout);
    }

    if (JSON.stringify(thirdParLayout).length !== 2) {
        grid.push(thirdParLayout);
    }

    if (JSON.stringify(fourthParLayout).length !== 2) {
        grid.push(fourthParLayout);
    }

    return {
        layout: grid,
        parentClass: parentClass
    };
});
