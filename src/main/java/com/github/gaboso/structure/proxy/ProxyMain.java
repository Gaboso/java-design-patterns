package com.github.gaboso.structure.proxy;

import com.github.gaboso.structure.proxy.proxy.SecurityProxy;
import com.github.gaboso.structure.proxy.service.TwitterService;
import com.github.gaboso.structure.proxy.service.TwitterServiceImpl;

public class ProxyMain {

    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("el_gaboso"));

        service.postToTimeline("el_gaboso", "Some message that shouldn't go through.");
    }

}
