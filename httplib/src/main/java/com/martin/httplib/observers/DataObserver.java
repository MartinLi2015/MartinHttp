package com.martin.httplib.observers;

import android.app.Dialog;

import com.martin.httplib.base.BaseDataObserver;
import com.martin.httplib.bean.BaseDataResult;
import com.martin.httplib.utils.DisposeUtils;
import com.martin.httplib.utils.ToastUtils;

import io.reactivex.disposables.Disposable;

/**
 * 适用于
 * {
 * "status":200,
 * "message":"成功"
 * "data":{}
 * };
 * {
 * "status":200,
 * "message":"成功"
 * "data":[]
 * }
 *
 * @author martin
 */


public abstract class DataObserver<T> extends BaseDataObserver<T> {

    private Dialog mProgressDialog;

    public DataObserver() {
    }

    public DataObserver(Dialog progressDialog) {
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
    protected abstract void onSuccess(T data);


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
    public void doOnNext(BaseDataResult<T> data) {
        onSuccess(data.getData());
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
