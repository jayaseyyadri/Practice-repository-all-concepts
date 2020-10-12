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

//Write a program that finds the summation of every number from 1 to num.
// The number will always be a positive integer greater than 0.

var summation = function (num) {
    var sum =0;
    for(var i =1;i<=num; i=i+1){
        sum=sum+i}
    return sum;
}