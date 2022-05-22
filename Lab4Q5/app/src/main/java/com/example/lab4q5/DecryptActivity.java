package com.example.lab4q5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DecryptActivity extends AppCompatActivity {
    EditText inText;
    Button decryptBtn;
    TextView outText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);
        inText=findViewById(R.id.inText);
        outText=findViewById(R.id.outText);
        decryptBtn=findViewById(R.id.DecryptBtn);
        decryptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inText.getText().toString().isEmpty())
                    outText.setText("Enter some text in EditText");
                else
                {
                    outText.setText(
                            SubsCipher.decrypt(inText.getText().toString())
                    );
                }
            }
        });
    }
}