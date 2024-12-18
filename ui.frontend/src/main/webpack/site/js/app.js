"use strict";

require('jquery');
require('bootstrap');

$(document).ready(function() {
    console.log('jQuery type is: ' + typeof $);
    console.log('Bootstrap modal type is: ' + typeof $().modal);
    console.log('Popper type is: ' + typeof Popper);
});
