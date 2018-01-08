package com.martin.httplib.observers;


import android.app.Dialog;

import com.martin.httplib.base.BaseObserver;
import com.martin.httplib.utils.DisposeUtils;
import com.martin.httplib.utils.ToastUtils;

import io.reactivex.disposables.Disposable;

/**
 * 自定义自己的类继承BaseObserver<T>即可
 *
 * @author martin
 */

public abstract class CommonObserver<T> extends BaseObserver<T> {


    private Dialog mProgressDialog;

    public CommonObserver(){

    }
    public CommonObserver(Dialog progressDialog) {
        mProgressDialog = progressDialog;
    }

    /**
     * 失败回调
     *
     * @param errorMsg 异常信息
     */
    protected abstract void onError(String errorMsg);

    /**
     * 成功回调
     *
     * @param t
     */
    protected abstract void onSuccess(T t);


    @Override
    public void doOnSubscribe(Disposable d) {
        DisposeUtils.getInstance().addDisposable(d);
    }

    @Override
    public void doOnError(String errorMsg) {
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
        ToastUtils.showToast(errorMsg);
        onError(errorMsg);
    }

    @Override
    public void doOnNext(T t) {
        onSuccess(t);
    }

    @Override
    public void doOnCompleted() {
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
    }
}
