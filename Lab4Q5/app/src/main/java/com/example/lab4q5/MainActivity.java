package com.example.lab4q5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button decrypt,encrypt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        decrypt=findViewById(R.id.decrypt);
        decrypt.setOnClickListener(this);
        encrypt=findViewById(R.id.encrypt);
        encrypt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        if(view==decrypt)
            intent=new Intent(this,DecryptActivity.class);
        else
            intent=new Intent(this,EncryptActivity.class);
        startActivity(intent);
    }
}