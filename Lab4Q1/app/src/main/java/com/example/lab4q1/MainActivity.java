package com.example.lab4q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText userName, password;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName=findViewById(R.id.userNameTxt);
        password=findViewById(R.id.passwordTxt);
        loginBtn=findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(this);
    }
//فى ال Activity دى انا مجرد بس ما بعمل Check اذا كان username , password فاضيين ولا لا
    @Override
    public void onClick(View view) {
        if(view==loginBtn
                && !userName.getText().toString().isEmpty()
                && !password.getText().toString().isEmpty())
        {
            startActivity(new Intent(this,Questions.class));
        }
    }
}