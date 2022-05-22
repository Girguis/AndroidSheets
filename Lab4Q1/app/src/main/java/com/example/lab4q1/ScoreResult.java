package com.example.lab4q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreResult extends AppCompatActivity {
    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_result);
        score=findViewById(R.id.scoreTxtView);
        Intent intent=getIntent();
        score.setText("your score :"+intent.getExtras().getInt("score"));
    }
}