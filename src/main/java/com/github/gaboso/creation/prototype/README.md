# Prototype Design Pattern

The **Prototype Design Pattern** is one of the twenty-three well-known _GoF design patterns_ which helps us to copy an
existing object rather than creating a new instance from scratch.

The **Prototype** pattern is used when we need to create a number of instances of a class and  each instance has almost
same state or has very little difference.

The **Prototype** pattern is used when creation of actual object directly is costly as per resource and data it holds also is a time taking.

The existing original object acts as a prototype and contains the state of the object. The new object is copy of the original object.

The **Prototype** pattern is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects.

We are free to change values in the newly copied object whenever we required.

The Prototype pattern helps us to save costly resources and time, especially when the object creation is a heavy and time taking process.

In Java, One of the best available way to create object from existing objects are by using `clone()` method of Cloneable interface.
**Clone** is the simplest approach to implement prototype pattern.

We can also implement Prototype interface by using **Deep Copy** method.

   * **Deep Copy** - By Deep copy we create an object by copying all the fields of the original object.
   Also, if the original object contains other objects as fields, we copy them as well.

   * **Shallow Copy** - By Shallow copy we create an object by copying all the fields of the original object.
   But if the original object contains other objects as fields, we copy only the reference of those objects instead of copying complete object itself.

### Concepts

* Avoids costly creation
* Avoids subclassing
* Typically doesn’t use “new”
* Often utilizes an Interface
* Usually implemented with a Registry
* Example:
    * `java.lang.Object#clone()`

### Design Considerations

* Clone / Cloneable
* Avoids keyword “new”
* Although a copy, each instance unique
* Costly construction not handled by client
* Can still utilize parameters for construction
* Shallow VS Deep Copy

### Pitfalls

* Sometimes not clear when to use
* Used with other patterns
    * Registry
* Shallow VS Deep Copy

### Reference

1. https://dzone.com/articles/using-prototype-design-pattern-in-java