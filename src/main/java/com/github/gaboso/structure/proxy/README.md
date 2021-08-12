# Proxy Design Pattern

The **Proxy Design Pattern** is a _Structural Design Pattern_ and one of the _Gang of Four design patterns_.

The **Proxy Design Pattern** gives a way to create a class that represents the functionality of another class.

The **Proxy** could interface to anything; a network connection, a large object in memory, a file, or some other resource
that is expensive or impossible to duplicate.

The **Proxy** is like a wrapper object that is being called by the client to access the real serving object behind the scenes.

The **Proxy** object hides the original object and control access to it.

The **Proxy** is used when we may like to create a class that can perform as an interface to something else.

The **Proxy** pattern allows us to create objects having an original object to interface their functionality to the client application.

The **Proxy** is most commonly used in the implementation of the lazy loading of objects.
I mean creating proxy objects in place of full real objects until it is actually needed.

The **Proxy** can also be used to add a layer of security around the real object.

The Proxy hides the Real object by providing a virtual and customized implementation.

We can do proxy in many ways like:

* **Virtual Proxy** - Do lazy loading of memory rich or heavy objects until it is needed.
* **Decorative Proxy** - Add extra functionality to the existing objects just like we do in Decorator Design Pattern.
* **Protective Proxy** - Control access to the objects functionality.
* **Debugging Proxy** - Add logs that may also be helpful in debugging.
* **Remote Proxy** - provides a local representative for a remote object like stub objects in RMI/RPC or CORBA.
* **Smart Proxy** - checking the lock on real object while updating, loading persistence object upon the first reference, managing real object reference, etc.

Client Application can use the _proxy object_ similar to the real object because both implement the same interface.

**Proxy Design Pattern uses** three components to implement:

* **Subject** - the interface which exposes the functionality.
* **Real Subject** - the class implements the **Subject** and provides the concrete implementation of the interface.
In this class, we hide behind the Proxy.
* **Proxy** - the class implements the **Subject** so that it can substitute **Real Subject** objects.
It maintains the reference of the **Real Subject** to the substituted **Proxy** object so that it can forward a request to the **Real Subject** whenever needed.

### Concept

* Interface by wrapping
* Can add functionality
* Security, Simplicity, Remote, Cost
* Proxy called to access real object
* Examples:
    * `java.lang.reflect.Proxy`
    * `java.rmi.*`

### Design Considerations

* Interface based
* Interface and Implementation Class
* java.lang.reflect.InvocationHandler
* java.lang.reflect.Proxy
* Client, Interface, InvocationHandler, Proxy, Implementation

### Pitfalls

* Only one proxy
* Another Abstraction
* Similar to other patterns

### Reference

1. https://dzone.com/articles/using-proxy-design-pattern-in-java