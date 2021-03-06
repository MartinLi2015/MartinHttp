package com.martin.httplib.base;

import com.martin.httplib.bean.BaseListResult;
import com.martin.httplib.exception.ApiException;
import com.martin.httplib.interfaces.IListSubscriber;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 数据格式为{"status":200,"message":"成功","list":{}}
 * 数据格式为{"status":200,"message":"成功","list":[]}
 * @author martin
 */

public abstract class BaseListObserver<T> implements Observer<BaseListResult<T>>, IListSubscriber<T> {

    @Override
    public final void onSubscribe(Disposable d) {
        doOnSubscribe(d);
    }

    @Override
    public final void onNext(BaseListResult<T> baseResult) {
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
