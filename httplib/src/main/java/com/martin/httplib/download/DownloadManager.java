package com.martin.httplib.download;


import com.martin.httplib.utils.CloseableUtils;
import com.martin.httplib.utils.ContextUtis;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import okhttp3.ResponseBody;

/**
 * 保存文件
 *
 * @author martin
 */

public class DownloadManager {


    /**
     * 保存文件
     *
     * @param response     ResponseBody
     * @param destFileName 文件名（包括文件后缀）
     * @return 返回
     * @throws IOException
     */
    public File saveFile(ResponseBody response, final String destFileName, ProgressListener progressListener) throws IOException {

        String destFileDir = ContextUtis.getContext().getCacheDir() + File.separator;

        long contentLength = response.contentLength();
        InputStream is = null;
        byte[] buf = new byte[2048];
        int len = 0;
        FileOutputStream fos = null;
        try {
            is = response.byteStream();
            long sum = 0;
            File dir = new File(destFileDir);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File file = new File(dir, destFileName);
            fos = new FileOutputStream(file);
            while ((len = is.read(buf)) != -1) {
                sum += len;
                fos.write(buf, 0, len);

                final long finalSum = sum;

                progressListener.onResponseProgress(finalSum, contentLength, (int) ((finalSum * 1.0f / contentLength) * 100), finalSum == contentLength, file.getAbsolutePath());
            }
            fos.flush();
            return file;
        } finally {
            CloseableUtils.close(response, is, fos);
        }
    }


}
