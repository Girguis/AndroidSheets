package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Q2 extends AppCompatActivity implements View.OnClickListener {
    EditText inTemp;
    RadioButton C,F;
    Button btn;
    RadioGroup groupR;
    TextView outTemp;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        inTemp= findViewById(R.id.inTemp);
        C= findViewById(R.id.C);
        F= findViewById(R.id.F);
        groupR= findViewById(R.id.groupR);
        outTemp= findViewById(R.id.outTemp);
        btn= findViewById(R.id.convert);
        layout= findViewById(R.id.layout);
        C.setOnClickListener(this);
        F.setOnClickListener(this);
        btn.setOnClickListener(this);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.C)
            layout.setBackgroundColor(Color.BLUE);
        else if(v.getId()==R.id.F)
            layout.setBackgroundColor(Color.GREEN);
        else if(v.getId()==R.id.convert)
        {
            float deg=Float.parseFloat(inTemp.getText().toString().isEmpty()?"0":inTemp.getText().toString());
            if(C.isChecked())
                outTemp.setText((deg * 9/5) + 32+"°F");
            else if(F.isChecked())
                outTemp.setText((deg - 32) * 5/9 +"°C");
        }
    }
}