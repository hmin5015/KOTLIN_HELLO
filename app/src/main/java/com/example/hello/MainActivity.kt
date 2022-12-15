package com.example.hello

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            show("안녕")
        }

        button2.setOnClickListener {
            val firstStr = input1.text.toString()
            val secondStr = input2.text.toString()

            val first = firstStr.toInt()
            val second = secondStr.toInt()

            val result = sum(first, second)
            output1.text = "더하기 결과: $result"
        }
    }

    fun show(message:String) {
        println("버튼이 눌렸어요. : $message")
    }

    fun sum(firstValue:Int, secondValue:Int) = firstValue + secondValue
}