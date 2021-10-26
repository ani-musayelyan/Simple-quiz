package com.example.myquiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_questions.*
import org.w3c.dom.Text

class QuestionsActivity : AppCompatActivity() , View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var correctAnswersCount = 0


    private var userName : String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)


        userName = intent.getStringExtra(Constants.User_Name)

        tv_true_opt.setOnClickListener(this)
        tv_false_opt.setOnClickListener(this)
        submit_btn.setOnClickListener(this)

        mQuestionsList = Constants.getQuestion()
        setQuestion()


    }

    private fun setQuestion() {
        defaultOptions()

        if (mCurrentPosition == mQuestionsList!!.size) {
            submit_btn.text == "Finish"
        } else {
            submit_btn.text == "Submit"
        }

        val question: Question? = mQuestionsList!![mCurrentPosition - 1]
        progress_bar.progress = mCurrentPosition
        progress_bar.max = mQuestionsList!!.size
        tv_progress.text = "$mCurrentPosition" + "/" + progress_bar.max
        tv_question.text = question!!.question
        tv_true_opt.text = question!!.optionTrue
        tv_false_opt.text = question!!.optionFalse

    }

    private fun defaultOptions() {
        val options = ArrayList<TextView>()
        options.add(0, tv_true_opt)
        options.add(1, tv_false_opt)

        for (option in options) {
            option.setTextColor(Color.BLACK)
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.option_style)

        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_true_opt -> {
                selectedOption(tv_true_opt, 1)
            }
            R.id.tv_false_opt -> {
                selectedOption(tv_false_opt, 2)
            }
            R.id.submit_btn -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()

                        }
                        else -> {
                            Toast.makeText(this, "Congrats ", Toast.LENGTH_SHORT).show()
                            val intent = Intent(this , ResultsActivity::class.java)
                            intent.putExtra(Constants.User_Name , userName.toString() )
                            intent.putExtra(Constants.Total_Questions , mQuestionsList!!.size.toString() )
                            intent.putExtra(Constants.Correct_Answers , correctAnswersCount.toString())
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)

                    if (question!!.correct != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.incorrect_option_style)
                    } else {
                        correctAnswersCount++
                    }

                    answerView(question.correct, R.drawable.correct_option_style)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        submit_btn.text = " Finish"
                    } else {
                        submit_btn.text = "Next question"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun selectedOption(tv: TextView, selectedOption: Int) {
        defaultOptions()
        mSelectedOptionPosition = selectedOption
        tv.setTextColor(Color.DKGRAY)
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_style)
    }

    private fun answerView(answer: Int, drawable: Int) {
        when (answer) {
            1 -> {
                tv_true_opt.background = ContextCompat.getDrawable(this, drawable)
            }
            2 -> {
                tv_false_opt.background = ContextCompat.getDrawable(this, drawable)
            }

        }

    }
}