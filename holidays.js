$(document).ready(function (){
    $('#submit-btn').click(function (){

        let movieToList=$('#addUserMovie').val();
        $('#songsList').append(`<li> ${movieToList} </li>`);
    })
$('#url-btn').click(function () {
    var userInput= $('#q').val();
    url="https://www.youtube.com/results?search_query"
    window.location.href = url + userInput ;
});


});