# Command Design Pattern

* In the **Command Design Pattern**, we wrap our requests in a **Command** object, along with all the required
information to perform an action of another object.

* The **Command** object knows about the **Receiver** and invokes methods of the receiver by supplying parameters.
Values for parameters of the receiver methods are stored in the Command object.

* The Receiver objects performs the job when the `execute()` method of Command gets called.

* We pass this Command object to an **Invoker** object to perform the execute method.
**Invoker** object executes the methods of the Command object and passes the required parameters to it.

* The **Invoker** objects knows how to execute the command.
But, it does not know anything about any concrete command.
All it knows about is the command _interface_/_abstract class_.

* The **Invoker** can take different Command objects time-to-time, so the Client deals only with the **Invoker**
to perform operations on different objects. These objects call **Receiver** objects.

* The **Command** object collects all the details of requests and performs operations on the Receiver.

* The **Command Design Pattern** supports **undoable** operations as well, and we can have an _unexecute_ kind of method
 to return the state of the object back to its original state.

* So, the pattern makes it super easy to perform a verity of jobs/requests in a simple way by using **Invoker** object.

* The **Invoker** may also do bookkeeping for the **Command** objects.

* Different **Command** object may have different **Receiver** object to act on.

### Reference

1. https://dzone.com/articles/command-design-pattern-in-java