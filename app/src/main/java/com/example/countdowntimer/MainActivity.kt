package com.example.countdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object:CountDownTimer(60000,1000){
            override fun onFinish() {
                textView.text = "Left: 0"
                Toast.makeText(applicationContext,"Time's OFF",Toast.LENGTH_LONG).show()
            }

            override fun onTick(millisUntilFinished: Long) {
                textView.text = " Left: " + millisUntilFinished / 1000
            }

        }.start()
    }
}
