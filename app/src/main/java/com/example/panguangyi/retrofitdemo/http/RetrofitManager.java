package com.example.panguangyi.retrofitdemo.http;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by panguangyi on 17/5/20.
 */

public class RetrofitManager {
    private static final String BASE_URL = "http://www.weather.com.cn/";

    private static class Holder{
        private final static Retrofit instance = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static Retrofit getInstance() {
        return Holder.instance;
    }
}
