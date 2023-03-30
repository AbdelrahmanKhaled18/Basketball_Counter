package com.example.basketball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class reasult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reasult)
        val result_finals:TextView=findViewById(R.id.result)
        val cup_pic:ImageView=findViewById(R.id.cup_photo)
        val btn:Button=findViewById(R.id.new_match)
        btn.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        cup_pic.setImageResource(R.drawable.cup)
        result_finals.setText("The winner is "+intent.getStringExtra("team")+ " with a score of "+ intent.getStringExtra("score"))

    }
}