package com.example.day_text.test07;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;


import com.example.day_text.util.GsonUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class RequestService extends IntentService {

    public RequestService() {
        super("RequestService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.e("TAG", "onHandleIntent");
        ByteArrayOutputStream bos = null;
        InputStream is = null;
        try {
            URL url = new URL("https://www.wanandroid.com/article/list/0/json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            bos = new ByteArrayOutputStream();
            conn.setRequestMethod("GET");
            if (conn.getResponseCode() == 200) {
                is = conn.getInputStream();
                //需要将InputStream转换为字符串
                byte[] buffer = new byte[1024];
                int len = 0;
                while ((len = (is.read(buffer))) != -1) {
                    bos.write(buffer, 0, len);   //将网络数据都写入了ByteArrayOutputStream中
                }
                //需要将ByteArrayOutputStream转换成字符串
                String jsonStr = new String(bos.toByteArray(), 0, bos.toByteArray().length);
                bos.close();
                is.close();
                Intent intent1 = new Intent();
                intent1.setAction("com.xx");
                intent1.putExtra("data",jsonStr);
                sendBroadcast(intent1);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            Log.e("TAG", "MalformedURLException");
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("TAG", "IOException");
        } finally {
            io_release(bos, is);
        }


    }


    private void io_release(ByteArrayOutputStream bos, InputStream is) {
        try {
            if (bos != null) {
                bos.close();
            }

            if (is != null) {
                is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}