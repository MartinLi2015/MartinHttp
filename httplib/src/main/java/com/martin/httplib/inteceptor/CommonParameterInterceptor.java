package com.martin.httplib.inteceptor;


import com.martin.httplib.interfaces.IExtraParameter;

import java.io.IOException;
import java.util.Map;

import io.reactivex.annotations.NonNull;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 公共参数拦截器
 * 添加共有参数
 *
 * @author martin
 */

public class CommonParameterInterceptor implements Interceptor {

    IExtraParameter iExtraParameter;

    public CommonParameterInterceptor(IExtraParameter iExtraParameter) {
        this.iExtraParameter = iExtraParameter;

    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {

        Request request = chain.request();
        if (iExtraParameter != null && iExtraParameter.getExtraParams() != null) {
            HttpUrl.Builder newBuilder = request.url().newBuilder();
            for (Map.Entry<String, Object> entry :
                    iExtraParameter.getExtraParams().entrySet()) {
                newBuilder.addQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
            request = request.newBuilder().url(newBuilder.build()).build();
        }
        return chain.proceed(request);
    }
}