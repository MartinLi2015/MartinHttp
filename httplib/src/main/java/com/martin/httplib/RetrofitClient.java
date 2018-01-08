package com.martin.httplib;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {


    private static RetrofitClient instance;

    public static RetrofitClient getInstance() {
        if (instance == null) {
            synchronized (RetrofitClient.class) {
                if (instance == null) {
                    instance = new RetrofitClient();
                }
            }
        }
        return instance;
    }

    private RetrofitClient() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(OkHttpConfig.getInstance().getBaseUrl())
                .client(OkClientBuilder.getInstance().getBuilder().build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    private Retrofit mRetrofit;

    public <T> T get(Class<T> tClass) {
        return mRetrofit.create(tClass);
    }

}