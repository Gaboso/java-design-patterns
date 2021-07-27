package com.github.gaboso.behavior.observer.observer;

import com.github.gaboso.behavior.observer.subject.Subject;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
