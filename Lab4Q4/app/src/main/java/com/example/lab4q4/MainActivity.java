package com.example.lab4q4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Receiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        receiver=new Receiver();
    }
    /*
     اول حاجة هتعمل New Broadcast receiver
     New -> Other -> BroadCast Receiver
     وهتديله اسم وليكن Receiver
     بعدين هنخش على Manifest file
    * هنلاقى جزء جديد اتضاف اسمه receiver جواه هنعمل
            <intent-filter>
                <action android:name="android.intent.action.BATTERY_LOW"/>
                <action android:name="android.net.wifi.WIFI_STATE_CHANGED"/>
            </intent-filter>
     جوه ال <intent-filter> هتضيف كل ال Events جوه Tag ال Action
     جوه Receiver هتلاقى فانكشن اسمها onReceive دى هتحط فيها اى حاجة انت عايزها تحصل
     وليكن هتظهر Toast مثلا لما تبقى ال Battery low
     بعد ما هتخلص كل ده هتيجى هنا فى MainActivity
     وتعمل Var جديد من type Receiver وتديله اى اسم
     وفى OnCreate هتعمله Initialize
     الخطوه الجاية هتعمل Override ل OnPause
       IntentFilter filter = new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        فى ال parameter هتكتب نفس اسم ال Event اللى حطيته فى Manifest file
        ولو فى اكتر من واحد هتعمل filter.addAction وتديها الاسم بتاع ال Event
        ......
        registerReceiver(receiver , filter);
        وفى الاخر بتعمل registerReceiver بحيث يبدأ يشتغل لو حصل Event
    * */
    @Override
    protected void onPause() {
        super.onPause();
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        filter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        registerReceiver(receiver , filter);
    }
}