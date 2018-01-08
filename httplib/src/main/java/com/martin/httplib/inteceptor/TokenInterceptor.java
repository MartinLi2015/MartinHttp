package com.martin.httplib.inteceptor;


import com.martin.httplib.interfaces.IExtraParameter;

import java.io.IOException;
import java.util.Map;

import io.reactivex.annotations.NonNull;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 添加token,cookie
 *
 * @author martin
 */

public class TokenInterceptor implements Interceptor {

    IExtraParameter iExtraParameter;

    public TokenInterceptor(IExtraParameter iExtraParameter) {
        this.iExtraParameter = iExtraParameter;

    }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request = chain.request();

        if (iExtraParameter != null && iExtraParameter.getExtraParams() != null) {
            Request.Builder newBuilder = request.newBuilder();
            for (Map.Entry<String, Object> entry :
                    iExtraParameter.getExtraParams().entrySet()) {
                newBuilder.addHeader(entry.getKey(), String.valueOf(entry.getValue()));
            }
            return chain.proceed(newBuilder.build());
        }
        return chain.proceed(request);
    }
}
