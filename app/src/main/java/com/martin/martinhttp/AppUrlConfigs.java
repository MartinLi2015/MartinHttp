package com.martin.martinhttp;

/**
 * @author martin
 */

public enum AppUrlConfigs {
    DOUBAN("http://api.douban.com/", "douban");

    private String baseUrl;
    private String tag;

    AppUrlConfigs(String baseUrl, String tag) {
        this.baseUrl = baseUrl;
        this.tag = tag;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getTag() {
        return this.tag;
    }
}
