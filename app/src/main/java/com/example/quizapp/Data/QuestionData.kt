package com.example.quizapp.Data



/*
Question Data class is just a format of how data should be stored
 */

data class QuestionData (
    var id:Int,
    var question:String,

    var option_one:String,
    var option_tw0:String,
    var option_three:String,
    var option_four:String,
    var correct_ans:Int
)