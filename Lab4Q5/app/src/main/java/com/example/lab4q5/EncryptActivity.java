package com.example.lab4q5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EncryptActivity extends AppCompatActivity {
    EditText inText;
    Button encryptBtn;
    TextView outText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt);
        inText=findViewById(R.id.inText);
        outText=findViewById(R.id.outText);
        encryptBtn=findViewById(R.id.EncryptBtn);
        encryptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inText.getText().toString().isEmpty())
                    outText.setText("Enter some text in EditText");
                else
                {
                    outText.setText(
                            SubsCipher.encrypt(inText.getText().toString())
                    );
                }
            }
        });
    }
}