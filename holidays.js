$(document).ready(function (){
    $('#submit-btn').click(function (){

        let movieToList=$('#addUserMovie').val();
        $('#songsList').append(`<li> ${movieToList} </li>`);
    })










});