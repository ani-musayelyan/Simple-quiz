package com.example.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        start_btn.setOnClickListener {
            if (name_input.text.isEmpty()) {
                Toast.makeText(this , "Enter your name " , Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this , QuestionsActivity::class.java)
                intent.putExtra(Constants.User_Name ,name_input.text.toString())
                startActivity(intent)
                finish()
            }
        }


    }
}