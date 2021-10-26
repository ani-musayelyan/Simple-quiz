package com.example.myquiz

data class Question (
    val id : Int ,
    val question : String ,
    val optionTrue : String ,
    val optionFalse : String ,
    val correct : Int
)