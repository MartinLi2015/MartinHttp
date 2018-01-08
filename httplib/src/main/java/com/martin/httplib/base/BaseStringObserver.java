package com.martin.httplib.base;

import com.martin.httplib.exception.ApiException;
import com.martin.httplib.interfaces.IStringSubscriber;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 结果直接返回string
 *
 * @author martin
 */
public abstract class BaseStringObserver implements Observer<String>, IStringSubscriber {

    @Override
    public void onSubscribe(Disposable d) {
        doOnSubscribe(d);
    }

    @Override
    public void onNext(String string) {
        doOnNext(string);
    }

    @Override
    public void onError(Throwable e) {
        String error = ApiException.handleException(e).getMessage();
        doOnError(error);
    }

    @Override
    public void onComplete() {
        doOnCompleted();
    }

}