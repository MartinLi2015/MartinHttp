package com.martin.httplib.inteceptor;

import com.martin.httplib.interfaces.IExtraParameter;

import java.io.IOException;
import java.util.Map;

import io.reactivex.annotations.NonNull;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 请求拦截器  统一添加请求头使用
 *
 * @author martin
 */

public class HeaderInterceptor implements Interceptor {

    IExtraParameter iExtraParameter;

    public HeaderInterceptor(IExtraParameter iExtraParameter) {
        this.iExtraParameter = iExtraParameter;
    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {

        // 头部为空,直接返回
        if (iExtraParameter == null || iExtraParameter.getExtraParams() == null
                || iExtraParameter.getExtraParams().isEmpty()) {
            return chain.proceed(chain.request());
        }
        // 生成新的request,并添加头部内容
        Request.Builder newBuilder = chain.request().newBuilder();
        for (Map.Entry<String, Object> entry : iExtraParameter.getExtraParams().entrySet()) {
            newBuilder.addHeader(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return chain.proceed(newBuilder.build());
    }
}
