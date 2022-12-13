package com.example.hello

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var name:String
    private var mobile:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            name = nameInput.text.toString()
            mobile = mobileInput.text.toString()

            /*
                Show message in Toast
            * */
            Toast.makeText(applicationContext, "이름: $name, 전화번호: $mobile", Toast.LENGTH_LONG).show()

            // show value in Logcat using println
            println("안녕 : ${name}")
        }
    }
}