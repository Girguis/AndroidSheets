package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Q1,Q2,Q3;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Q1=(Button) findViewById(R.id.Q1);
        Q2=(Button) findViewById(R.id.Q2);
        Q3=(Button) findViewById(R.id.Q3);
        Q1.setOnClickListener(this);
        Q2.setOnClickListener(this);
        Q3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.Q1)
            intent = new Intent(this, Q1.class);
        else if (v.getId() == R.id.Q2)
            intent = new Intent(this, Q2.class);
        else if (v.getId() == R.id.Q3)
            intent = new Intent(this, Q3.class);
        startActivity(intent);
    }
}