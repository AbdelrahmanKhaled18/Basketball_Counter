package com.example.basketball
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class scores : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scores)
       var team_a:TextView=findViewById(R.id.teamA)
        var team_b:TextView=findViewById(R.id.teamB)

        team_a.setText(intent.getStringExtra("text"))
        team_b.setText(intent.getStringExtra("text2"))

        val teamAscore: TextView =findViewById(R.id.team_a_score)
        val teamBscore: TextView =findViewById(R.id.team_b_score)



        val add3ptsBtnTeamA: Button = findViewById(R.id.pts3_a)
        val add2ptsBtnTeamA: Button = findViewById(R.id.pts2_a)
        val fthrowBtnTeamA: Button = findViewById(R.id.pt1s_a)




        val add3ptsBtnTeamB: Button = findViewById(R.id.pts3_b)
        val add2ptsBtnTeamB: Button = findViewById(R.id.pts2_b)
        val fthrowBtnTeamB: Button = findViewById(R.id.pts1_b)


        val finish_btn:Button=findViewById(R.id.finish)



        add3ptsBtnTeamA.setOnClickListener { plusScore(3,teamAscore)}
        add2ptsBtnTeamA.setOnClickListener { plusScore(2,teamAscore) }
        fthrowBtnTeamA.setOnClickListener { plusScore(1,teamAscore) }



        add2ptsBtnTeamB.setOnClickListener { plusScore(2,teamBscore) }
        add3ptsBtnTeamB.setOnClickListener { plusScore(3,teamBscore) }
        fthrowBtnTeamB.setOnClickListener { plusScore(1,teamBscore) }

        finish_btn.setOnClickListener {
        val intent=Intent(this,reasult::class.java)
            if(teamAscore.text.toString().toInt()>teamBscore.text.toString().toInt())
            {
                intent.putExtra("score",teamAscore.text.toString())
                intent.putExtra("team",team_a.text.toString())

            }
            else
            {
                intent.putExtra("score",teamBscore.text.toString())
                intent.putExtra("team",team_b.text.toString())

            }


            startActivity(intent)

        }





    }

    private fun plusScore(points:Int,label: TextView)
    {
        val currentScore=label.text.toString().toInt()
        val newScore=currentScore+points
        label.text="$newScore"
    }

}


