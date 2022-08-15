package com.example.jankenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.jankenapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //手のボタンを推されたら呼ばれる
        fun judgeJanken(view: View){
            //どの手が押されたか
            val judgeJanken: Button = findViewById(view.id)
            val btnText = judgeJanken.text.toString()
        }


    }
}