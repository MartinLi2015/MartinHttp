package com.martin.httplib.inteceptor;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.martin.httplib.interfaces.NetworkMonitor;
import com.martin.httplib.utils.ContextUtis;

/**
 * 网络拦截器
 *
 * @author lixinliang
 */

public class NetworkInterceptor implements NetworkMonitor {
    @Override
    public boolean isConnected() {
        ConnectivityManager cm =
                (ConnectivityManager) ContextUtis.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
       
    }

    @Override
    public boolean isWifi() {
        return false;
    }
}
