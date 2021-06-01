package com.example.day_text;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.day_text.test07.DataBeanInfo;
import com.example.day_text.test07.RequestService;
import com.example.day_text.util.GsonUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.xx");
        registerReceiver(receiver, filter);
        //开启Service
        startService(new Intent(MainActivity.this, RequestService.class));

    }
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String josnStr = intent.getStringExtra("data");
            DataBeanInfo dataBeanInfo = GsonUtil.str2Bean(josnStr, DataBeanInfo.class);
            Toast.makeText(MainActivity.this, dataBeanInfo.toString(), Toast.LENGTH_LONG).show();
            Log.e("TAG", dataBeanInfo.toString());
        }
    };


    @Override
    protected void onDestroy() {
        unregisterReceiver(receiver);
        super.onDestroy();
    }

}
