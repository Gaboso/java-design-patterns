package com.github.gaboso.structure.proxy.service;

public interface TwitterService {

    String getTimeline(String screenName);

    void postToTimeline(String screenName, String message);

}
