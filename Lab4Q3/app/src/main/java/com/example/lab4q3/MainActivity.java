package com.example.lab4q3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    /*
        اول حاجة محتاج انك تضيف ال Permission بتاع الكاميرا فى Manifest
        <uses-permission android:name="android.permission.CAMERA"/>
        بعدين فى ال Activity هتبقى محتاج حاجتين اول حاجة VideoView
        وتانى حاجة محتاج Button بحيث لما تدوس عليه يفتح معاك الكاميرا
        جوه الفانكشن بتاعت ال click هنعمل Intent جديده و Parameter بتاعها هو عباره عن MediaStore.ACTION_VIDEO_CAPTURE
        بعدين بنعمل startActivityForResult وهنا بتاخد 2 Parameters اول حاجة ال intent
        وتانى حاجة هنديها const value بحيث بعدين لما ال result ترجع لينا نتأكد انها نفس الحاجة اللى كنا طالبينها
        لما تخلص الجزء ده هتحتاج حاجة علشان تعمل receive للفيديو
        ف هنا هنعمل Override للفانكشن اللى اسمها onActivityResult
        من الفانكشن دى هتقدر تجيب العنوان بتاع الفيديو اللى اتصور وده هنخزنه فى متغير من نوع Uri
        بعدين ممكن تشغل الفيديو على طول زى ما فى الفانكشن تحت
        او تعمل Button لما تدوس عليه يشفل الفيديو
    * */
    final int VIDEO_REQUEST =1;
    Button openCameraBtn;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoView);
        openCameraBtn=findViewById(R.id.goToCameraBtn);
        openCameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(intent,VIDEO_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==VIDEO_REQUEST && resultCode==RESULT_OK && data.getData()!=null)
        {
                videoView.setVideoURI(data.getData());
                videoView.start();
        }
    }
}