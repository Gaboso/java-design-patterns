# Builder Design Pattern

The Builder design pattern is designed to provide a flexible solution to various object creation problems in object-oriented programming.

The Builder design pattern provides a way to separate the construction of a complex object from its representation.

The Builder pattern constructs a complex object by using simple objects and step by step approach.

The pattern provides one of the best ways to create a complex object.

It is one of the Gang of Four design patterns that describe how to solve recurring design problems in object-oriented software.

This pattern is useful to build different immutable objects using same object building process.


### Concepts

* Handles complex constructors
* Large number of parameters
* Immutability
* Examples:
    * StringBuilder
    * DocumentBuilder
    * Locale.Builder

### Design Considerations

* Flexibility over telescoping constructors
* Static inner class
* Calls appropriate constructor
* Negates the need for exposed setters
* Java 1.5+ can take advantage of Generics

### Pitfalls

* Immutable
* Inner static class
* Designed first
* Complexity
* Method returns object

### Reference

1. https://dzone.com/articles/singleton-in-java