package com.github.gaboso.behavior.observer;

import com.github.gaboso.behavior.observer.observer.PhoneClient;
import com.github.gaboso.behavior.observer.observer.TabletClient;
import com.github.gaboso.behavior.observer.subject.MessageStream;
import com.github.gaboso.behavior.observer.subject.Subject;

public class ObserverMain {

    public static void main(String[] args) {
        Subject subject = new MessageStream();

        var phoneClient = new PhoneClient(subject);
        var tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message!");
        tabletClient.addMessage("Another new message!");
    }

}
