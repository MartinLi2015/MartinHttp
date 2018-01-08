package com.martin.httplib.bean;

/**
 * 基础数据封装
 * @author martin
 */

public class BaseDataResult<T> extends BaseData<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {

        return new StringBuilder().append(super.toString())
                .append("\n")
                .append("BaseDataResult{ data= ")
                .append(data.toString())
                .append("}").toString();
    }
}
