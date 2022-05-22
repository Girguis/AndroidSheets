package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Q1 extends AppCompatActivity {
    Button calc;
    EditText inSecs;
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        calc= findViewById(R.id.convert);
        inSecs= findViewById(R.id.inSecs);
        out = findViewById(R.id.outTime);
    }
    public void calcTime(View v)
    {
        long h, secs= Long.parseLong(inSecs.getText().toString().isEmpty()?"0":inSecs.getText().toString());
        int s,m;
        h =secs / 3600;
        m =(int)(secs %3600)/60;
        s =(int)(secs %3600) - 60 * m;
        out.setText((h>9?"":"0")+h+":"+(m>9?"":"0")+m+":"+(s>9?"":"0")+s);
    }
}