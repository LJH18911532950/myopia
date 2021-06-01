package com.example.day_text.util;


import com.google.gson.Gson;

import java.lang.reflect.Type;

public class GsonUtil {
    private static Gson mGson;
    private static Object object;

    static {  //随着类的加载而加载  主要在里面做对象的初始化工作
        mGson = new Gson();
    }



    //将Json字符串解析成实体Bean    静态里面不能访问非静态
    public static <T> T str2Bean(String str, Class<T> clazz) {
        return mGson.fromJson(str, clazz);
    }


    //将Bean解析成JSON字符串    静态里面不能访问非静态
    public static <T> String Bean2Str(T t) {
        return mGson.toJson(t);
    }


    //将JSON字符串解析成数组
    public static <T> T[] str2Arr(String str, Type type) {
        return mGson.fromJson(str, type);
    }

}