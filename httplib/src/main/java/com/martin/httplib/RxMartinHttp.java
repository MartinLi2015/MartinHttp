package com.martin.httplib;

/**
 * 请求类
 *
 * @author martin
 */

public class RxMartinHttp {

    public static <K> K createApi(Class<K> cls) {
        return RetrofitClient.getInstance().get(cls);
    }
}
