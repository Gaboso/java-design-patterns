package com.github.gaboso.behavior.observer.subject;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

    private final Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    public String getState() {
        return messageHistory.getLast();
    }

    @Override
    public void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }

}
