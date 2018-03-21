package com.martin.httplib.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * 关闭
 *
 * @author lixinliang
 */

public class CloseableUtils {
    public static void close(Closeable... closeables) {

        try {
            if (closeables == null) {
                return;
            }
            for (Closeable cloneable : closeables) {
                if (cloneable == null) {
                    continue;
                }
                cloneable.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
