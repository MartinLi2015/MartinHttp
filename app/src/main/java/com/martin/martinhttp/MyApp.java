package com.martin.martinhttp;

import android.app.Application;


import com.martin.httplib.OkHttpConfig;
import com.martin.httplib.interfaces.IExtraParameter;
import com.martin.httplib.utils.ContextUtis;

import java.util.Map;

/**
 * Created by martin on 2018/1/5.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ContextUtis.init(this);
        OkHttpConfig.getInstance()
                .setConnectTimeout(10)
                .setReadTimeout(30)
                .setWriteTimeout(30)
                .setBaseUrl(AppUrlConfigs.DOUBAN.getBaseUrl())
                .addCommonParamterInterceptor(new IExtraParameter() {
                    @Override
                    public Map<String, Object> getExtraParams() {
                        return null;
                    }
                })
                .addMoreBaseUrlInterceptor(new BaseUrlConfig())
                .addTokenHeaderInterceptor(new IExtraParameter() {
                    @Override
                    public Map<String, Object> getExtraParams() {
                        return null;
                    }
                })
                .setLog(BuildConfig.DEBUG)
                .setSslSocketFactory();
    }
}
