package com.martin.httplib.download;

/**
 * 下载监听
 *
 * @author martin
 */

public interface ProgressListener {

    /**
     * 载进度监听
     *
     * @param bytesRead     已经下载文件的大小
     * @param contentLength 文件的大小
     * @param progress      当前进度
     * @param done          是否下载完成
     * @param filePath      文件路径
     */
    void onResponseProgress(long bytesRead, long contentLength, int progress, boolean done, String filePath);

}
