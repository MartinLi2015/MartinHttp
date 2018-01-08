package com.martin.martinhttp;

import com.martin.httplib.interfaces.IMoreBaseUrl;

/**
 * 根据tag获取对应的baseUrl
 *
 * @author martin
 */

public class BaseUrlConfig implements IMoreBaseUrl {

    @Override
    public String getBaseUrlByTag(String tag) {
        if (AppUrlConfigs.DOUBAN.getTag().equals(tag)) {
            return AppUrlConfigs.DOUBAN.getBaseUrl();
        }
        return AppUrlConfigs.DOUBAN.getBaseUrl();
    }

}
