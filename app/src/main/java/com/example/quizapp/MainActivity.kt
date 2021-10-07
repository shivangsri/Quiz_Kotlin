package com.example.quizapp

/**
 *
 * Author : Shivang Srivastav
 */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.quizapp.Data.SetData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if(input.text.toString().isEmpty())
            {
                Toast.makeText(this,"Enter Your Name", Toast.LENGTH_SHORT).show()
            }

            //Calling the QuestionActivity where question to be answered are present
            else{
                var intent = Intent(this,QuestionActivity::class.java)
                intent.putExtra("${SetData.name}",input.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}