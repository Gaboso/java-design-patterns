# Iterator Design Pattern

* The **Iterator Design Pattern** is one of twenty-three well-known _GoF design patterns_ provides a way to access the
elements of an aggregate object sequentially without exposing its underlying representation.

* **Iterator Design Pattern** provides an Iterator object to traverse a collection/container and access its member objects.

* **Iterator Design Pattern** is a relatively simple design pattern, which we use almost in every project.

* Few containers requires an algorithm to access the member elements.
**Iterator Design Pattern** decouples any such algorithm from the container.

* The algorithm can be written separately to use by the **Iterator** and hence can be use by any container
which supports that kind of Iterator object.

* The **Iterator Design Pattern** provides flexible and reusable solution of traversing member objects of a container/collection.
That make our collection object easier to implement, change, test and reuse.

* **Iterator** object also facilitate removing of member object while traversing the collection.
So, it's one of the solution of `ConcurrentModificationException`.

### Reference

1. https://dzone.com/articles/iterator-design-pattern-in-java