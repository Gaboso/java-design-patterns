# Abstract Factory Pattern

The abstract factory pattern is a **creational pattern** which provides a way to encapsulate a group of individual factories
that have a common purpose or theme; without specifying their concrete classes.

The Abstract Factory patterns work around a **super-factory** which creates other factories.

This super-factory is also known as a **factory of factories**.

The Abstract Factory pattern is responsible for creating a factory of related objects without explicitly specifying their classes.

Each generated factory can give the objects as per the **Factory pattern**.

So in short, Abstract factory provides an interface to create different concrete factories. Each such factory works with a family or group objects.
And hence Abstract factory provides a way to work with multiple such factories.
 So, we can also call it as factory of factories.

### Concept

* Factory of Factories
* Factory of related objects
* Common Interface
* Defer to Subclasses
* Examples:
    * DocumentBuilder
    * Frameworks

### Design Considerations

* Groups Factories together
* Factory is responsible for lifecycle
* Common Interface
* Concrete Classes
* Parameterized create method
* Composition

### Pitfalls

* Complexity
* Runtime switch
* Pattern within a pattern
* Problem specific
* Starts as a Factory

### Reference

1. https://dzone.com/articles/abstract-factory-pattern-in-java