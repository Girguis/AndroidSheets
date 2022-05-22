package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Q3 extends AppCompatActivity implements View.OnClickListener {
    RadioButton s,m,l;
    CheckBox cheese,chicken,beef;
    EditText cheeseNo,chickenNo,beefNo;
    Button order;
    TextView outPizza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        s= findViewById(R.id.small);
        m= findViewById(R.id.medium);
        l= findViewById(R.id.large);
        cheese= findViewById(R.id.cheese);
        chicken= findViewById(R.id.chicken);
        beef=findViewById(R.id.beef);
        cheeseNo=findViewById(R.id.cheeseNo);
        chickenNo=findViewById(R.id.chickenNo);
        beefNo=findViewById(R.id.beefNo);
        order=findViewById(R.id.orderBtn);
        outPizza=findViewById(R.id.outPizzaPrice);
        order.setOnClickListener(this);
        cheese.setOnClickListener(this);
        beef.setOnClickListener(this);
        chicken.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.cheese)
        {
            if(cheese.isChecked())
                cheeseNo.setVisibility(View.VISIBLE);
            else
                cheeseNo.setVisibility(View.INVISIBLE);
        }
        else if(v.getId()==chicken.getId())
        {
            if(chicken.isChecked())
                chickenNo.setVisibility(View.VISIBLE);
            else
                chickenNo.setVisibility(View.INVISIBLE);
        }
        else if(v.getId()==beef.getId())
        {
            if(beef.isChecked())
                beefNo.setVisibility(View.VISIBLE);
            else
                beefNo.setVisibility(View.INVISIBLE);
        }
        else if(v.getId()==order.getId())
        {
            int cheeseTopping=0,chickenTopping=0,beefTopping=0,totalCost=0;
            if(cheese.isChecked()) cheeseTopping= Integer.parseInt(cheeseNo.getText().toString().isEmpty()?"0":cheeseNo.getText().toString());
            if(chicken.isChecked()) chickenTopping= Integer.parseInt(chickenNo.getText().toString().isEmpty()?"0":chickenNo.getText().toString());
            if(beef.isChecked()) beefTopping= Integer.parseInt(beefNo.getText().toString().isEmpty()?"0":beefNo.getText().toString());

            if(s.isChecked()) totalCost=10*cheeseTopping+12*chickenTopping+13*beefTopping;
            else if(m.isChecked()) totalCost=12*cheeseTopping+14*chickenTopping+15*beefTopping;
            else totalCost=14*cheeseTopping+16*chickenTopping+17*beefTopping;

            outPizza.setText("Pizza costs "+totalCost+"$");
        }
    }
}