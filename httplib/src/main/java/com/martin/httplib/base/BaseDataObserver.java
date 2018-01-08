package com.martin.httplib.base;


import com.martin.httplib.bean.BaseDataResult;
import com.martin.httplib.exception.ApiException;
import com.martin.httplib.interfaces.IDataSubscriber;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 数据格式为{"status":200,"message":"成功","data":{}}
 * 数据格式为{"status":200,"message":"成功","data":[]}
 *
 * @author martin
 */

public abstract class BaseDataObserver<T> implements Observer<com.martin.httplib.bean.BaseDataResult<T>>, IDataSubscriber<T> {

    @Override
    public final void onSubscribe(Disposable d) {
        doOnSubscribe(d);
    }

    @Override
    public final void onNext(BaseDataResult<T> baseResult) {
        doOnNext(baseResult);
    }

    @Override
    public final void onError(Throwable e) {
        String error = ApiException.handleException(e).getMessage();
        setError(error);
    }

    @Override
    public final void onComplete() {
        doOnCompleted();
    }

    private void setError(String errorMsg) {
        doOnError(errorMsg);
    }
}
