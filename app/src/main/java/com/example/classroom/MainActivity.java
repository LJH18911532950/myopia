package com.example.classroom;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import java.nio.channels.AsynchronousChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        SharedPreferences sp = this.getSharedPreferences("sp", 0);
        int count = sp.getInt("start_count", 0);

        //     Toast.makeText(this, String.valueOf(count)+"", Toast.LENGTH_SHORT).show();

        if (count == 0) {
            SharedPreferences.Editor edit = sp.edit();
            //存入数据
            edit.putInt("start_count", ++count);
            //提交修改
            edit.commit();
            //    	Toast.makeText(this, "Guide", Toast.LENGTH_SHORT).show();
            Intent mIntent = new Intent();
            mIntent.setClass(MainActivity.this, HomeActivity.class);
            MainActivity.this.startActivity(mIntent);
            MainActivity.this.finish();
            //mhandler.sendEmptyMessageDelayed(SWITCH_GUIDE, 100);
        } else {
            //  	Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
            Disposable disposable = Observable.intervalRange(0, 3, 0, 1, TimeUnit.SECONDS)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Consumer<Long>() {
                        @Override
                        public void accept(Long aLong) throws Exception {
                            Long j = 2 - aLong;
                            if (j == 0) {
                                Intent intent = new Intent(MainActivity.this, ComActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        }
                    });

        }



    }
}