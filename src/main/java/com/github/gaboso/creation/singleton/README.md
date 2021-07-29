# Singleton Design Pattern

The singleton design pattern is used to restrict the instantiation of a class and ensures that only one instance of the class exists in the JVM.
In other words, a singleton class is a class that can have only one object (an instance of the class) at a time per JVM instance.
There are various ways to design/code a singleton class.

##### Class-level Member (Eager Initialization Method)

```java
public class SingletonClass {

    private static final SingletonClass SINGLE_INSTANCE = new SingletonClass();

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        return SINGLE_INSTANCE;
    }

}
```

##### Class-level Member (Lazy Initialization Method)

```java
public class SingletonClass {

    private static SingletonClass SINGLE_INSTANCE = null;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized(SingletonClass.class) {
                SINGLE_INSTANCE = new SingletonClass();
            }
        }
        return SINGLE_INSTANCE;
    }

}
```

##### Class-level Member (Lazy Initialization with double lock Method)

```java
public class SingletonClass {

    private static SingletonClass SINGLE_INSTANCE = null;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (SingletonClass.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new SingletonClass();
                }
            }
        }
        return SINGLE_INSTANCE;
    }

}
```

##### By using nested Inner class (Lazy Load method

```java
public class SingletonClass {

    private SingletonClass() {}

    private static class SingletonClassHolder {
        static final Something SINGLE_INSTANCE = new SingletonClass();
    }

    public static SingletonClass getInstance() {
        return SingletonClassHolder.SINGLE_INSTANCE;
    }

}
```

##### By using Enums

```java
public enum SingletonClass {
    SINGLE_INSTANCE;
}
```

### Concepts

* Only one instance created
* Guarantees control of a resource
* Lazily loaded
* Examples:
    * Runtime
    * Logger
    * Spring Beans
    * Graphic Managers

### Design Considerations

* Class is responsible for lifecycle
* Static in nature
* Needs to be thread safe
* Private instance
* Private constructor
* No parameters required for construction

### Pitfalls

* Often overused
* Difficult to unit test
* If not careful, not thread-safe
* Sometimes confused for Factory
* `java.util.Calendar` is NOT a Singleton
    * Prototype

### Reference

1. https://dzone.com/articles/singleton-in-java