package com.example.basketball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var start:Button=findViewById(R.id.Start)
        val error:TextView=findViewById(R.id.error)
        start.setOnClickListener {
            val intent=Intent(this,scores::class.java)
            val text=findViewById<EditText>(R.id.TEAM_A).text.toString()
            val text2=findViewById<EditText>(R.id.TEAM_B).text.toString()
            if (text.isEmpty()||text2.isEmpty()){
             error.setText("Please,put the names of the two teams")
            }
            else
            {
            intent.putExtra("text",text)
            intent.putExtra("text2",text2)
            startActivity(intent)
            }
        }





    }
}