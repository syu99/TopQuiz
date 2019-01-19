package com.example.johan.topquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

  private   TextView gQuestionText;
  private   Button aswerBtn1;
  private   Button answerBtn2;
  private   Button answerBtn3;
  private   Button answerBtn4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gQuestionText =(TextView) findViewById(R.id.activity_game_question_text);



    }
}
