package com.martin.httplib.inteceptor;


import com.martin.httplib.interfaces.IMoreBaseUrl;

import java.io.IOException;
import java.util.List;

import io.reactivex.annotations.NonNull;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 处理retrofit多baseurl的问题
 *
 * @author martin
 */

public class MoreBaseUrlInterceptor implements Interceptor {

    private IMoreBaseUrl iMoreBaseUrl;
    public MoreBaseUrlInterceptor(IMoreBaseUrl iMoreBaseUrl){
        this.iMoreBaseUrl =iMoreBaseUrl;
    }
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {

        //获取原始请求
        Request originalRequest = chain.request();
        // 获取老的url
        HttpUrl oldUrl = originalRequest.url();
        // 获取originalRequest的创建者builder;
        Request.Builder builder = originalRequest.newBuilder();
        //获取头部信息的集合
        List<String> urlNameList = originalRequest.headers("urlName");
        if (urlNameList != null && urlNameList.size() > 0) {
            //删除用于配置多个baseUrl的header;
            builder.removeHeader("urlName");
            //获取头信息中配置的value
            String urlName = urlNameList.get(0);
            HttpUrl baseUrl = HttpUrl.parse(iMoreBaseUrl.getBaseUrlByTag(urlName));
            //重建新的HttpUrl，需要重新设置的url部分
            HttpUrl newHttpUrl = oldUrl.newBuilder()
                    .scheme(baseUrl.scheme())//协议
                    .host(baseUrl.host())//主机地址
                    .port(baseUrl.port())//端口号
                    .build();
            Request request = builder.url(newHttpUrl).build();
            return chain.proceed(request);
        } else {
            return chain.proceed(originalRequest);
        }
    }
}
