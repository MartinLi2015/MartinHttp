package com.martin.httplib.interfaces;

import com.martin.httplib.bean.BaseListResult;

import io.reactivex.disposables.Disposable;

/**
 * 定义请求结果处理接口
 *
 * @author martin
 */

public interface IListSubscriber<T> {

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
    void doOnNext(BaseListResult<T> baseData);

    /**
     * 请求完成回调
     */
    void doOnCompleted();
}
