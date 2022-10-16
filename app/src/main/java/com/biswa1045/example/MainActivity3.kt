package com.biswa1045.example

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var text:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btn = findViewById(R.id.btn)
        text = findViewById(R.id.text)
        btn.setOnClickListener(){
            f()
        }


    }
    fun f(){
        val name = text.editableText.toString()
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }
}