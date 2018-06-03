package com.zhenchen.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/*****************************
 * Created by Raytine on 2018/6/3.
 * Description: send http request by okhttp3
 *****************************/
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
