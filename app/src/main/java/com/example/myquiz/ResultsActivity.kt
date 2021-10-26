package com.example.myquiz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_results.*

class ResultsActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val userName : String? = intent.getStringExtra(Constants.User_Name)

        tv_name_input.text = "Congratulations , $userName"

        val total  = intent.getStringExtra(Constants.Total_Questions)
        val correctAnswers : String? = intent.getStringExtra(Constants.Correct_Answers)

        tv_correct_count.text = "Your score is $correctAnswers out of $total"

        result_btn.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
            finish()
        }








    }
}