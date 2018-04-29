# Chain of Responsibility
### Purpose
Sometimes in our application we are passing requests between objects/classes where we don't know who the reciever or passer is, but we want the processing of the object to be continous. And the processor does not need to know where it rests in the hierarchy

* Decoupling of sender and reciever
* Reciever contains reference to next reciever to continue the chain
* Promotes loose coupling
* It should be okay if there isn't a handler for a given request
    * java.util.logging.Logger#log()
    * javax.servlet.Filter#doFilter()
    * Spring Security Filter Chain

### Design
* CHain of reciever objects, a form of a list
* ChainOfResponsibility.Handler is interface based
* Concrete ChainOfResponsibility.Handler for each implementation to interpet the request
* Each handler has a reference to the next
* UML: ChainOfResponsibility.Handler and Concrete ChainOfResponsibility.Handler

Client -> ChainOfResponsibility.Handler[handleRequest()] ->{ConcreteHandler1, ConcreteHandler2}

The handler will pass it to the next handler if it does not know how to handle the request -> successor

### Everyday Example - Logging
logger.setLevel(Level.FINER);

ConsoleHandler handler = new ConsoleHandler();
handler.setLevel(Level.FINER);
logger.addHandler(handler);

logger.finest("Finest level of logging");
logger.finer("Finer level, but not as fine as finest");
logger.fine("Fine, but not as fine as finer or finest");

### Pit falls
Can we actually guarantee that the correct handlers are always going to be able to hit all the handlers we wanted to hit.
Can we test all combination of the chain? If the number of chains increase then the amount of testing also increases.
Are we going to be able to make sure there isn't a huge performance decrease due to the different chains that will execute.
 
### Comparison between other patterns
####  Chain of Responsibility
* Handler is unique
* Successor allows us to program behaviours
* Can utilize the command
####  Command Pattern
* Command also unique
* Encapsulates function
* Reversible or Trackable in nature