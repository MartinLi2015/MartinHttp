package com.martin.httplib;

import android.util.Log;

import com.martin.httplib.inteceptor.CommonParameterInterceptor;
import com.martin.httplib.inteceptor.MoreBaseUrlInterceptor;
import com.martin.httplib.inteceptor.TokenInterceptor;
import com.martin.httplib.interfaces.IExtraParameter;
import com.martin.httplib.interfaces.IMoreBaseUrl;
import com.martin.httplib.utils.SSLUtils;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * OkHttpClient 配置类 需要在Application中进行初始化
 *
 * @author martin
 */

public class OkHttpConfig {


    private static final String TAG = "OkHttpConfig";

    private static OkHttpConfig instance;


    private String baseUrl;

    public static OkHttpConfig getInstance() {
        if (instance == null) {
            synchronized (OkHttpConfig.class) {
                if (instance == null) {
                    instance = new OkHttpConfig();
                }
            }
        }
        return instance;
    }

    private OkHttpClient.Builder getOkBuilder() {
        return OkClientBuilder.getInstance().getBuilder();
    }

    /**
     * 添加拦截器
     *
     * @param interceptor 拦截器
     * @return
     */
    public OkHttpConfig addInterceptor(Interceptor interceptor) {
        getOkBuilder().addInterceptor(interceptor);
        return this;
    }

    /**
     * 添加公共参数拦截器
     *
     * @return
     */
    public OkHttpConfig addCommonParamterInterceptor(IExtraParameter iExtraParameter) {
        getOkBuilder().addInterceptor(new CommonParameterInterceptor(iExtraParameter));
        return this;
    }

    /**
     * 该拦截器用于实现单retrofit多baseUrl
     *
     * @return
     */
    public OkHttpConfig addMoreBaseUrlInterceptor(IMoreBaseUrl iMoreBaseUrl) {
        getOkBuilder().addInterceptor(new MoreBaseUrlInterceptor(iMoreBaseUrl));
        return this;
    }

    /**
     * 添加头部拦截器
     *
     * @return
     */
    public OkHttpConfig addTokenHeaderInterceptor(IExtraParameter iExtraParameter) {
        getOkBuilder().addInterceptor(new TokenInterceptor(iExtraParameter));
        return this;
    }

    /**
     * 设置连接超时时间
     *
     * @param seconds 秒
     * @return
     */
    public OkHttpConfig setConnectTimeout(long seconds) {
        getOkBuilder().connectTimeout(seconds, TimeUnit.SECONDS);
        return this;
    }

    /**
     * 设置读超时时间
     *
     * @param seconds 秒
     * @return
     */
    public OkHttpConfig setReadTimeout(long seconds) {
        getOkBuilder().readTimeout(seconds, TimeUnit.SECONDS);
        return this;
    }

    /**
     * 设置写超时时间
     *
     * @param seconds 秒
     * @return
     */
    public OkHttpConfig setWriteTimeout(long seconds) {
        getOkBuilder().writeTimeout(seconds, TimeUnit.SECONDS);
        return this;
    }

    /**
     * 开启日志
     *
     * @param isShowLog 是否开启日志
     * @return
     */
    public OkHttpConfig setLog(boolean isShowLog) {
        if (isShowLog) {
            HttpLoggingInterceptor HTTP_LOGGING_INTERCEPTOR =
                    new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                        @Override
                        public void log(String message) {
                            Log.e(TAG, message);
                        }
                    }).setLevel(HttpLoggingInterceptor.Level.BODY).setLevel(HttpLoggingInterceptor.Level.HEADERS);
            getOkBuilder().addInterceptor(HTTP_LOGGING_INTERCEPTOR);
        }
        return this;
    }

    /**
     * 信任所有证书,不安全有风险
     *
     * @return
     */
    public OkHttpConfig setSslSocketFactory() {
        SSLUtils.SSLParams sslParams = SSLUtils.getSslSocketFactory();
        getOkBuilder().sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager);
        return this;
    }

    /**
     * 使用预埋证书，校验服务端证书（自签名证书）
     *
     * @param certificates
     * @return
     */
    public OkHttpConfig setSslSocketFactory(InputStream... certificates) {
        SSLUtils.SSLParams sslParams = SSLUtils.getSslSocketFactory(certificates);
        getOkBuilder().sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager);
        return this;
    }

    /**
     * 使用bks证书和密码管理客户端证书（双向认证），使用预埋证书，校验服务端证书（自签名证书）
     *
     * @param bksFile
     * @param password
     * @param certificates
     * @return
     */
    public OkHttpConfig setSslSocketFactory(InputStream bksFile, String password, InputStream... certificates) {
        SSLUtils.SSLParams sslParams = SSLUtils.getSslSocketFactory(bksFile, password, certificates);
        getOkBuilder().sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager);
        return this;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public OkHttpConfig setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
}
