package com.martin.httplib.observers;

import android.app.Dialog;


import com.martin.httplib.base.BaseStringObserver;
import com.martin.httplib.utils.DisposeUtils;
import com.martin.httplib.utils.ToastUtils;

import io.reactivex.disposables.Disposable;


/**
 * 自定义Observer 处理string回调
 *
 * @author martin
 */

public abstract class StringObserver extends BaseStringObserver {

    private Dialog mProgressDialog;

    public StringObserver() {

    }

    public StringObserver(Dialog progressDialog) {
        mProgressDialog = progressDialog;
    }

    /**
     * 失败回调
     *
     * @param errorMsg 错误信息
     */
    protected abstract void onError(String errorMsg);

    /**
     * 成功回调
     *
     * @param data 结果
     */
    protected abstract void onSuccess(String data);


    @Override
    public void doOnSubscribe(Disposable d) {
        DisposeUtils.getInstance().addDisposable(d);
    }

    @Override
    public void doOnError(String errorMsg) {
        dismissLoading();
        ToastUtils.showToast(errorMsg);
        onError(errorMsg);
    }

    @Override
    public void doOnNext(String string) {
        onSuccess(string);
    }


    @Override
    public void doOnCompleted() {
        dismissLoading();
    }

    /**
     * 隐藏loading对话框
     */
    private void dismissLoading() {
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
    }
}
