//function for Hello world

function helloWorld(){
    var sayHello="Hello World!";
    console.log(sayHello);
}

helloWorld();

//wrute a fubction which given  time in hours , returns the number of litres Natty will drink, rounded to the smallest value.
function litres(time) {
    var litre=.5;
    return Math.floor(time*litre);                                                                                 ;
}

console.log(litres(2));