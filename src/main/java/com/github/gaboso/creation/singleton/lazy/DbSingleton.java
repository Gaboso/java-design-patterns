package com.github.gaboso.creation.singleton.lazy;

public class DbSingleton {

    private static DbSingleton instance = null;

    private DbSingleton() {
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            instance = new DbSingleton();
        }

        return instance;
    }
}
