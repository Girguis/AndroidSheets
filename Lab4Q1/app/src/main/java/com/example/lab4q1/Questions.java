package com.example.lab4q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class Questions extends AppCompatActivity implements View.OnClickListener {
    ArrayList<RadioGroup> radioGroups = new ArrayList<>();;
    Button scoreBtn;
    /*
    *هنا انا اشتغلت بطريقة انى اعمل list واخزن فيها كل ال radioGroups اللى عندى
    * بعد ما بخزنهم بنزل على ال function بتاعت OnClick تحت
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        scoreBtn=findViewById(R.id.scoreBtn);
        scoreBtn.setOnClickListener(this);
        radioGroups.add(findViewById(R.id.q1Group));
        radioGroups.add(findViewById(R.id.q2Group));
    }

    @Override
    public void onClick(View view) {
        /*
        * هنا بعمل متغير بحيث ازود فيه ال score
        * بعدين بمشى foreach على ال list اللى شامله كل radioGroups اللى عندى
        * getCheckedRadioButtonId()
        * دى بترجع ليها id بتاع ال Checked radio button و بعدين بجيب ال radioButton نفسه عن طريق findViewById
        * وفى حاله ان اليوز مختارش حاجة ف انا بعمل check ان r لازم متساويش null
        لو هى بقا مش ب null والاجابه اللى اليوزر اختارها بتساوى الاجابه الصح * اللى انا فارضها T * ف هزود الاسكور
        * غير كده مش هعمل حاجة
        * وبعد ما تخلص اللوب بروح على Activity اللى هيظهر فيها الاسكور
        * */
        int score=0;
        if(view==scoreBtn)
        {
            for(RadioGroup rg : radioGroups)
            {
                RadioButton r =findViewById(rg.getCheckedRadioButtonId());
                if(r!=null && r.getText().toString().equalsIgnoreCase("T"))
                    score++;
            }
            Intent intent =  new Intent(this,ScoreResult.class);
            intent.putExtra("score",score);
            startActivity(intent);
        }
    }
}