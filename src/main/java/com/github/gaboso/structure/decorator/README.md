# Decorator Design Pattern

The **decorator design pattern** allows us to dynamically add functionality and behavior to an object without affecting
the behavior of other existing objects in the same class.

We use inheritance to extend the behavior of the class. These takes place at compile time, and all the instances of that
class get the extended behavior.

Decorator design patterns allow us to add functionality to an object (not the class) at runtime, and we can apply this
customized functionality to an individual object based on our requirement and choice.

   * Decorator patterns allow a user to add new functionality to an existing object without altering its structure.
   So, there is no change to the original class.

   * The decorator design pattern is a _**structural pattern**_, which provides a wrapper to the existing class.

   * Decorator design pattern uses abstract classes or interfaces with the composition to implement the wrapper.

   * Decorator design patterns create decorator classes, which wrap the original class and provide additional functionality
   by keeping the class methods' signature unchanged.

   * Decorator design patterns are most often used for applying single responsibility principles since we divide the
   functionality into classes with unique areas of concern.

   * The decorator design pattern is structurally similar to the chain of responsibility pattern.

### Concept

* Also, called a wrapper
* Add behavior without affecting others
* More than just inheritance
* Single Responsibility Principle
* Compose behavior dynamically
* Examples:
    * `java.io.InputStream`
    * `java.util.Collections#checkedList`
    * UI components

### Design Considerations

* Inheritance based
* Utilizes composition and inheritance (_is-a_, _has-a_)
* Alternative to subclassing
* Constructor requires instance from hierarchy

### Pitfalls

* New class for every feature added
* Multiple little objects
* Often confused with simple inheritance

### Reference

1. https://dzone.com/articles/decorator-design-pattern-in-java