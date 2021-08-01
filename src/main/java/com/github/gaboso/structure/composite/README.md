# Composite Design Pattern

The **Composite Design Pattern** is meant to "compose objects into a tree structure to represent part-whole hierarchies.
**Composite Pattern** lets clients treat individual objects and compositions of objects uniformly".

   * The **Composite Design** patterns describe groups of objects that can be treated in the same way as a single instance of the same object type.

   * The **Composite** pattern allows us to "compose" objects into tree structures to represent part-whole hierarchies.

   * In addition, the **Composite** patterns also allow our clients to treat individual objects and compositions in the same way.

   * The **Composite** patterns allow us to have a tree structure for each node that performs a task.

   * In object-oriented programming, a **Composite** is an object designed as a composition of one-or-more similar objects,
   all exhibiting similar functionality. This is known as a "**has-a**" relationship between objects.

Below is the list of classes/objects used in the composite pattern, which has four :

   * **Component** – Component is the interface (or abstract class) for the composition of the objects and methods for
   accessing/processing its child or node components. It also implements a default interface to define common functionalities/behaviors for all component classes.

   * **Leaf** – The leaf class defines a concrete component class, which does not have any further composition.
   The leaf class implements the component interface. It performs the command/task at its end only.

   * **Composite** – The composite class defines a concrete component class, which stores its child components.
   The composite class implements the component interface. It forwards the command/task to the composite objects it contains.
   It may also perform additional operations before and after forwarding the command/task.

   * **Client** – The client class uses the component interface to interact/manipulate the objects in the composition (Leaf and Composite).

### Concept

* Components represent part or whole structure
* Compose objects into tree structures
* An individual object treated as a Composite
* Same operations applied on individual and composites
* Examples:
    * `java.awt.Component`
    * JSF widgets
    * RESTful service GETs

### Design Considerations

* Tree structured
* Component
* Leaf or Composite, same operations
* Composite knows about child objects
* Component, Leaf, Composite

### Pitfalls

* Can overly simplify system
* Difficult to restrict
* Implementation can be costly

### Reference

1. https://dzone.com/articles/composite-design-pattern-in-java-1