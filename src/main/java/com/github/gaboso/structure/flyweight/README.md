# Flyweight Design Pattern

The **Flyweight Design Pattern** is a _Structural Design Pattern_ and one of the _Gang of Four design patterns_.

The **Flyweight** pattern is used to minimize the memory usage by sharing as much data as possible with other similar objects.

The **Flyweight** pattern provides a way to reduce the number of objects created and to decrease memory footprint and increase performance.

The **Flyweight** pattern tries to reuse already existing similar kind objects by storing them in a collection which act
like a _cache_ and creates a new object when no matching object is found.

The **Flyweight** objects we create as _immutable_. This means that they cannot be modified once they have been constructed.
Making flyweight objects as immutable helps while sharing them with other objects.

The data structures for graphical representation of characters in a _Word Processor_ is a very good classical example of **Flyweight** pattern.

The _String Interning_ is another very good example of **Flyweight** pattern.

The **Flyweight** pattern helps us to avoid having large number of objects and allow us to effectively used the created
objects by reusing them as much as possible.

The Flyweight object essentially has two different kind of attributes:

   * **Intrinsic** - An **intrinsic** (invariant) state attribute is stored and shared in the flyweight object.
   It is independent of _flyweight's context_. So, as the best practice we should make intrinsic states _immutable_.

   * **Extrinsic** - An **extrinsic** (variant) state attribute does not store and share in the flyweight object because
   it depends on _flyweight's context_ and varies as context change.
   Generally, we store and maintain the extrinsic state in the Client objects.
   We need to pass this extrinsic state to the **flyweight** object for object creation and processing.

### Concept

* More efficient use of memory
* Large number of similar objects
* Immutable
* Most of the object states can be extrinsic
* Examples:
    * `java.lang.String`
    * `java.lang.Integer#valueOf(int)`
    * Boolean, Byte, Character, Short, Long

### Design Considerations

* Pattern of patterns
* Utilizes a Factory
* Encompasses Creation and Structure
* Client, Factory, Flyweight, ConcreteFlyweight

### Pitfalls

* Complex pattern
* Premature optimization
* Must understand Factory
* Not a graphical pattern

### Reference

1. https://dzone.com/articles/using-flyweight-design-pattern-in-java