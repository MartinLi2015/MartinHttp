package com.martin.httplib.utils;

import android.app.Application;
import android.content.Context;

/**
 * 注入Context;
 *
 * @author martin
 */

public class ContextUtis {

    
    private static Context context;

    public static void init(Application application) {
        ContextUtis.context = application;
    }

    public static Context getContext() {
        if (context == null) {
            throw new NullPointerException("you should init in Application");
        }
        return context;
    }
}
