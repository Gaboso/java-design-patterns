package com.github.gaboso.creation.singleton.threadsafe;

public class SingletonMain {

    public static void main(String[] args) {
        var instance = DbSingleton.getInstance();
        System.out.println("instance        = " + instance);

        var anotherInstance = DbSingleton.getInstance();
        System.out.println("anotherInstance = " + anotherInstance);
    }

}
