package com.martin.httplib.utils;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.Disposable;

/**
 * 控制请求
 *
 * @author martin
 */


public class DisposeUtils {
    private static DisposeUtils instance;

    public static DisposeUtils getInstance() {
        if (instance == null) {
            synchronized (DisposeUtils.class) {
                if (instance == null) {
                    instance = new DisposeUtils();
                }
            }
        }
        return instance;
    }

    private DisposeUtils() {
        disposableList = new ArrayList<>(16);
    }


    private static List<Disposable> disposableList;


    /**
     * 获取disposable 在onDestroy方法中取消订阅disposable.dispose()
     *
     * @param disposable disposable
     */
    public void addDisposable(Disposable disposable) {
        if (disposableList != null) {
            disposableList.add(disposableList.size(), disposable);
        }
    }

    /**
     * 取消所有请求
     */
    public void cancelAllRequest() {
        if (disposableList != null) {
            for (Disposable disposable : disposableList) {
                disposable.dispose();
            }
            disposableList.clear();
        }
    }

    /**
     * 取消单个请求
     */
    public static void cancelSingleRequest(Disposable disposable) {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }
}


