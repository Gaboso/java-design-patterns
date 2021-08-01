# Adapter Design Pattern

The adapter design pattern is a structural design pattern that allows two unrelated/uncommon interfaces to work together.
In other words, the adapter pattern makes two incompatible interfaces compatible without changing their existing code.

Interfaces may be incompatible, but the inner functionality should match the requirement.

The adapter pattern is often used to make existing classes work with others without modifying their source code.

Adapter patterns use a single class (the adapter class) to join functionalities of independent or incompatible interfaces/classes.

The adapter pattern also is known as the wrapper, an alternative naming shared with the decorator design pattern.

This pattern converts the (incompatible) interface of a class (the adaptee) into another interface (the target) that clients require.

The adapter pattern also lets classes work together, which, otherwise, couldn't have worked, because of the incompatible interfaces.

For example, let's take a look at a person traveling in different countries with their laptop and mobile devices.
We have a different electric socket, volt, and frequency measured in different countries and that makes the use of any
appliance of one country to be freely used in a different country. In the United Kingdom, we use Type G socket with 230 volts
and 50 Hz frequency. In the United States, we use Type A and Type B sockets with 120 volts and 60 Hz frequency.
In India, we use Type C, Type D and Type M sockets with 230 volts and 50 Hz. lastly, in Japan, we use Type A and Type B sockets with 110 volts and 50 Hz frequency.
This makes the appliances we carry incompatible with the electric specifications we have at different places.

This makes the adapter tool essential because it can make/convert incompatible code into compatible code. Please notice here that we have not achieved anything additional here — there is no additional functionality, only compatibility.

### Concept

* Plug adaptor
* Convert interface into another interface
* Legacy
* Translates requests
* Client, Adapter, Adaptee
* Examples:
    * Arrays -> Lists
    * Streams

### Design Considerations

* Client centric
* Integrate new with old
* Interface, but not required
* Adaptee can be the implementation

### Pitfalls

* Not a lot!
* Don’t complicate
* Multiple Adapters
* Don’t add functionality

### Reference

1. https://dzone.com/articles/adapter-design-pattern-in-java