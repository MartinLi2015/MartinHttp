package com.martin.httplib;

import okhttp3.OkHttpClient;

public class OkClientBuilder {
    private OkHttpClient.Builder mBuilder;

    OkClientBuilder() {
        mBuilder = new OkHttpClient.Builder();
    }

    public static class OkClientBuilderHolder {
        static OkClientBuilder httpClient = new OkClientBuilder();
    }

    public static OkClientBuilder getInstance() {
        return OkClientBuilderHolder.httpClient;
    }


    public OkHttpClient.Builder getBuilder() {
        return mBuilder;
    }

}
