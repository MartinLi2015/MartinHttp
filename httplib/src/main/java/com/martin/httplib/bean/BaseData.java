package com.martin.httplib.bean;

/**
 * 基础数据
 *
 * @author martin
 */

public class BaseData<T> {

    private String status;
    private String message;

    private static final String SUCCESS = "200";//成功
    private static final String SERVER_ERROR = "500"; //服务器错误
    private static final String TOKEN_INVALIDE = "403"; // token验证失败

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public boolean isSuccess() {
        return SUCCESS.equals(status);
    }

    public boolean isServerError() {
        return SERVER_ERROR.equals(status);
    }

    public boolean isTokenInvalide() {
        return TOKEN_INVALIDE.equals(status);
    }

    @Override
    public String toString() {
        return "BaseData{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
