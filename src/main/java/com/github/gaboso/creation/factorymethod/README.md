# Factory Method Design Pattern

The **factory design pattern** is a creational design pattern, which provides one of the best ways to create objects.
This pattern uses factory methods to deal with the problem of creating objects without specifying the exact class of the object that it has to create.

In factory patterns, we create objects by calling a factory method rather than by calling a constructor.

The factory pattern is one of the most used design patterns in Java.

The object creation logic is:

   * Implemented either in an interface or implemented by child classes.

   * Or, it is implemented in a base class and optionally overridden by derived classes.

In the factory design pattern, we create an object without exposing the creation logic to the client.

So, in short, the factory pattern gives the applicable object from the family of classes that we can use.
This object represents an algorithm as well as lots of other functionalities.

### Concepts

* Doesn't expose instantiation logic
* Defer to subclasses
* Common interface
* Specified by architecture, implemented by user
* Examples:
    * Calendar
    * ResourceBundle
    * NumberFormat

### Design Considerations

* Factory is responsible for lifecycle
* Common Interface
* Concrete Classes
* Parameterized create method

### Pitfalls

* Complexity
* Creation in subclass
* Refactoring

### Reference

1. https://dzone.com/articles/strategy-vs-factory-design-pattern-in-java