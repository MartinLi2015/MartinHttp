package com.martin.httplib.interfaces;

/**
 * monitor network
 *
 * @author martin
 */
public interface NetworkMonitor {
    boolean isConnected();
    boolean isWifi();
}