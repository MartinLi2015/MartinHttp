package com.martin.httplib;

import com.martin.httplib.download.DownloadRetrofit;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * 请求类
 *
 * @author martin
 */

public class RxMartinHttp {

    public static <K> K createApi(Class<K> cls) {
        return RetrofitClient.getInstance().get(cls);
    }


    public static Observable<ResponseBody> downloadFile(String fileUrl) {
        return DownloadRetrofit.downloadFile(fileUrl);
    }
}
