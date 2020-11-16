function submitAnswers(){
    var total =5;
    var score=0;


    var q1=document.forms['quizForm']['q1'].value;
    var q2=document.forms['quizForm']['q2'].value;
    var q3=document.forms['quizForm']['q3'].value;
    var q4=document.forms['quizForm']['q4'].value;
    var q5=document.forms['quizForm']['q5'].value;

    //validation
    for(var i=1;i<=total;i++){
        if(eval('q'+i)=='' || eval('q'+i) =='null'){
            alert("you missed question"+ i)
        }
    }

    return false
}