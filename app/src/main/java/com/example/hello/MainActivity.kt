package com.example.hello

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var first:Int = 0
    var second:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            val firstStr = input1.text.toString()
            val secondStr = input2.text.toString()

            first = firstStr.toInt()
            second = secondStr.toInt()

            val result = first + second
            output1.text = "결과 : $result"

            if (result == 20) {
                output1.text = "더하기 결과가 20 입니다."
            }

            if (firstStr == "10") {
                output1.append("\n첫번째 입력된 값이 10입니다.")
            }

            val input1:Any = "안녕"
            val input2:Any = 10

            if (input1 is String) {
                val output2:String = input1 as String
                output1.text = "input1 은 문자열 자료형입니다."
            }

            val output3:String? = input1 as String?
        }
    }
}