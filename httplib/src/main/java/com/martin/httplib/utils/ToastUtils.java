package com.martin.httplib.utils;

import android.widget.Toast;

/**
 *
 */

public class ToastUtils {
    private static Toast mToast;
    /**
     * Toast提示
     *
     * @param msg 提示内容
     */
    public static void showToast(String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(ContextUtis.getContext(), msg, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(msg);
        }
        mToast.show();
    }

}
