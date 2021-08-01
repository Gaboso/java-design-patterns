# Bridge Design Pattern

The bridge design pattern is a structural pattern used to decouple an abstraction from its implementation so that the two can vary independently.

Bridge patterns decouple the abstract class and its implementation classes by providing a bridge structure between them.

The bridge uses encapsulation, aggregation, and inheritance to separate responsibilities into various classes.

The bridge pattern is useful when both the class and what it does vary, often because changes in the class can be made
easily with minimal prior knowledge about the program.

We can think of the class itself as an _abstraction_, what the class can do as the _implementation_,
and the bridge pattern, itself, as two layers of _abstraction_.

The bridge pattern allows us to avoid compile-time binding between an abstraction and its implementation.
This is so that an implementation can be selected at run-time.

In other words, by using the bridge pattern, we can configure an abstraction with an implementor object at run-time.

The bridge design pattern is one of the 23 well-known _GoF design patterns_.

### Concept

* Decouple Abstraction and implementation
* Encapsulation, Composition, Inheritance
* Changes in Abstraction won’t affect client
* Details won’t be right
* Examples:
    * Driver
    * JDBC

### Design Considerations

* Interfaces and Abstract classes
* Composition over Inheritance
* More than Composition
* Expect change from both sides
* Abstraction, Implementor, Refined
* Abstraction, Concrete Implementor

### Pitfalls

* Increases complexity
* Conceptually difficult to plan
* More than just OO
* What goes where

### Reference

1. https://dzone.com/articles/bridge-design-pattern-in-java