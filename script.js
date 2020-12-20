$(document).ready(function (){
    //Set variables
    var speed=500;//fade speed between transitions in ms
    var autoswitch = true;
    var autoswitch_speed=4000;

    //add active class
    $('.slide').first().addClass('active');
    //add all slides
    $('.slide').hide();
   //show active slide
    $('.slide').show();

    $('#next').on('click',nextSlide);
    $('#prev').on('click',prevSlide);

// //Auto slider
    if(autoswitch==true){
        setInterval(nextSlide,autoswitch_speed);
    }

// //switch to next slide
    function nextSlide(){
        $('.active').removeClass('active').addClass('oldActive');
        if($('.oldActive').is(':last-child')) {
            $('.slide').first().addClass('active');
        }else{
            $('.oldActive').next().addClass('active');
        }
        $('.oldActive').removeClass('oldActive');
        $('.slide').fadeOut(speed);
        $('.active').fadeIn(speed);
    }
// //switch to prev slide
    function prevSlide(){
        $('.active').removeClass('active').addClass('oldActive');
        if($('.oldActive').is(':first-child')) {
            $('.slide').last().addClass('active');
        }else{
            $('.oldActive').prev().addClass('active');
        }
        $('.oldActive').removeClass('oldActive');
        $('.slide').fadeOut(speed);
        $('.active').fadeIn(speed);
    }

});