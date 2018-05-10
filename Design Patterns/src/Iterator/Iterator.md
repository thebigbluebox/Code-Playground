# Iterator Pattern
If you wanted to traverse a object structure traditionally you would need a for loop or while loop, but this will require specific knowledge of the data type and its structure.
The iterator pattern does not expose the underlying structure of the container, and allows for various implementations for how access and iteration is done instead of having the client do it by hand.
It decouples the algorithms used to implement various search and traverse operations.
Iterator can handle the traversal that best represents that sequence of the individual objects.
Examples:
    Java.util.iterator used across all of our collections
    Java.util.enumeration
    
## Design
Interface based, every object that we do interate will have to provide a method in which it will return the data 
Follows a factory Method based, where you can get the instance of the iterator. 
Two iterators cannot  modify the underlying data structure without failing, while enumerators are fail safe.
