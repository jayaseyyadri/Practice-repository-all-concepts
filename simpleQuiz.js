function submitAnswers() {
    var total = 5;
    var score = 0;

    //get value from user input
    var q1 = document.forms['quizForm']['q1'].value;
    var q2 = document.forms['quizForm']['q2'].value;
    var q3 = document.forms['quizForm']['q3'].value;
    var q4 = document.forms['quizForm']['q4'].value;
    var q5 = document.forms['quizForm']['q5'].value;

    //validation
    for (var i = 1; i <= total; i++) {
        if (eval('q' + i) == '' || eval('q' + i) == 'null') {
            alert("you missed question" + i)
            return false
        }
    }

    //arr for answers
    var answers = ['a', 'b', 'b', 'a', 'c'];

    //check answers
    for (i = 1; i <= total; i++) {
        if (eval('q' + i) == answers[i - 1]) {
            score++
        }
    }
        var r = document.getElementById('results')
        r.innerHTML = "<h3>You have scored <span>" +' '+score+' ' +"</span>out of<span>"+' '+total+"</span></h3>"
    return false;
}

