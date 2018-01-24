package com.martin.httplib.observers;

import android.app.Dialog;

import com.martin.httplib.base.BaseListObserver;
import com.martin.httplib.bean.BaseListResult;
import com.martin.httplib.utils.DisposeUtils;
import com.martin.httplib.utils.ToastUtils;

import io.reactivex.disposables.Disposable;

/**
 * 适用于
 * {
 * "status":200,
 * "message":"成功"
 * "list":{}
 * };
 * {
 * "status":200,
 * "message":"成功"
 * "list":[]
 * }
 *
 * @author martin
 */

public abstract class ListObserver<T> extends BaseListObserver<T> {

    private Dialog mProgressDialog;
    public ListObserver(){

    }

    public ListObserver(Dialog progressDialog) {
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
        onError(errorMsg);
    }

    @Override
    public void doOnNext(BaseListResult<T> list) {
        onSuccess(list.getList());
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
