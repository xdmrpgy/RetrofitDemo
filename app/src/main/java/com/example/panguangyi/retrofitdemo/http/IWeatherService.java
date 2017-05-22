package com.example.panguangyi.retrofitdemo.http;

import com.example.panguangyi.retrofitdemo.bean.WeatherBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by panguangyi on 17/5/20.
 */

public interface IWeatherService {

    @GET("data/cityinfo/101010100.html")
    Call<WeatherBean> getWeather();
}
