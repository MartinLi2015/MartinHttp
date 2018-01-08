package com.martin.httplib.bean;

/**
 * @author martin
 */

public class BaseListResult<T> extends BaseData<T> {
    private T list;

    public T getList() {
        return list;
    }

    public void setList(T list) {
        this.list = list;
    }
}
