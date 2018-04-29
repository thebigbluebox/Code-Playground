# Command Pattern
Encapsulates each request as an object, if its a large system then it becomes very hard to maintain very quickly.
Decouples sender from processor just like the chain of responsibility.
And now can be used for undo functionality, as we can trace which object called and the interaction it had through the chain.
Examples:
    * java.lang.Runnable
    * javax.swing.Action

### Design
Object per command, maybe not completely OO adhered. As each action is contained in a object
Command Interface which will contain an execute method, which can also have an unexecute method for an undo function
Advanced use of reflection to completely decouple the sender and the reciever.
Pieces of the UML -> {Command, Invoker, ConcreteCommand}

When the requests are encapsulated in the object, the state of the request is also maintained, instead of relying on the client to maintain the state.
This completely decouples the client from maintaining and creating objects and their state

### Pitfalls
* Dependence on other patterns
* Multiple Commands
* Make use of Memento for undo functionality
* Prototype for copies of an object for commands