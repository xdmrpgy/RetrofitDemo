package com.example.panguangyi.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.panguangyi.retrofitdemo.bean.WeatherBean;
import com.example.panguangyi.retrofitdemo.http.IWeatherService;
import com.example.panguangyi.retrofitdemo.http.RetrofitManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IWeatherService service = RetrofitManager.getInstance().create(IWeatherService.class);
        Call<WeatherBean> call = service.getWeather();
        call.enqueue(new Callback<WeatherBean>() {
            @Override
            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
                WeatherBean bean = response.body();
                Log.d(TAG,bean.getWeatherinfo().toString());
            }

            @Override
            public void onFailure(Call<WeatherBean> call, Throwable t) {

            }
        });
    }
}
