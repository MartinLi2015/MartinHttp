package com.martin.httplib.base;

import com.martin.httplib.exception.ApiException;
import com.martin.httplib.interfaces.ISubscriber;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 自定义数据类型
 *
 * @author martin
 */

public abstract class BaseObserver<T> implements Observer<T>, ISubscriber<T> {

    @Override
    public final void onSubscribe(Disposable d) {
        doOnSubscribe(d);
    }

    @Override
    public final void onNext(T baseResult) {
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
