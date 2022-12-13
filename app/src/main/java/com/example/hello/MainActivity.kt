package com.example.hello

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var name = nameInput.text.toString()
            var mobile = mobileInput.text.toString()

            Toast.makeText(applicationContext, "이름: $name, 전화번호: $mobile", Toast.LENGTH_LONG).show()
        }
    }
}