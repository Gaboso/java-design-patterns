# Facade Design Pattern

The **Facade** is a _Structural Design Pattern_ and one of the _Gang of Four design patterns_.

The **Facade** object is used to provide a front-facing interface by masking a more complex underlying system.

The **Facade** may provide a _limited or dedicated set of functionalities_. But, the functionalities Facade provides are mainly
 required by the client application. So, its more caring as per client needs.

The primary purpose of the **Facade** is to hide complexities of a system/subsystem by providing simpler interface to deal with.

Using **Facade** is super-easy when we have to deal with a complex system/subsystem having lots of functionalities and different configurations.

So, **Facade** hides minor and inner details of any third party library, system or subsystem we should know before we deal with it.

In Java there are many features like JDBC, JPA, JAX-RS etc. which hides the minor details and provide a simpler interface
 in form of annotations or easier configuration to deal with.

Even our computer system's POST (_power-on-self-test_) procedure which runs at the time we start our system; is a good
example of **Facade**. it checks RAM, CPU, HDD and other connected peripherals before giving control over to operating system.

Facade introduces additional layer of abstraction via Facade. So, if the sub-system changes, we need to do corresponding
changes in the facade layer as well.

### Concept

* Make an API easier to use
* Reduce dependencies on outside code
* Simplify the interface or client usage
* Usually a refactoring pattern
* Examples:
    * `java.net.URL`
    * `javax.faces.context.FacesContext`

### Design Considerations

* Class that utilizes composition
* Shouldn't have a need for inheritance
* Typically, encompasses full lifecycle

### Pitfalls

* Typically, used to clean up code
* Should think about API design
* Flat problem/structure
* The “Singleton” of Structural Pattern

### Reference

1. https://dzone.com/articles/facade-design-pattern-in-java