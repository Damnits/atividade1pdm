package com.example.atividade3

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textViewMsg: TextView
    private lateinit var textViewMsg2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.textViewMsg2 = findViewById(R.id.tvOutro)
    }
    fun onClickMethod1(view: View){
        this.textViewMsg2.text = Build.HARDWARE
    }



}