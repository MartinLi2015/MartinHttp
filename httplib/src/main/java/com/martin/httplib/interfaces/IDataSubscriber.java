package com.martin.httplib.interfaces;

import com.martin.httplib.bean.BaseDataResult;

import io.reactivex.disposables.Disposable;

/**
 * 定义请求结果处理接口
 *
 * @author martin
 */

public interface IDataSubscriber<T> {

    /**
     * doOnSubscribe 回调
     *
     * @param d Disposable
     */
    void doOnSubscribe(Disposable d);

    /**
     * 错误回调
     *
     * @param errorMsg 错误信息
     */
    void doOnError(String errorMsg);

    /**
     * 成功回调
     *
     * @param baseData 基础泛型
     */
    void doOnNext(BaseDataResult<T> baseData);

    /**
     * 请求完成回调
     */
    void doOnCompleted();
}
