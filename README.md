# Design Patterns Java Examples

## Structural patterns

Design Patterns that ease the design by identifying a simple way to realize relationships between entities.Structural design patterns are concerned with how classes and objects can be composed, to form larger structures. They simplify the structure by identifying the relationships. These patterns focus on, how the classes inherit from each other and how they are composed from other classes


- Composite : A tree structure of simple and composite objects.Allowing clients to operate on hierarchy of objects

- Adapter : Match interfaces of different classes.Purpose is toprovide the interface according to client requirement while using the services of a class with a different interface.The Adapter Pattern is also known as Wrapper

- Bridge:is used when we need to decouple an abstraction from its implementation so that the two can vary independently


- Decorator:Attach additional responsibilities to an object dynamically

- Facade :Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use


## Creational patterns
Design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation


- Factory:Define an interface for creating an object, but let the subclasses decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses


- Abstract Factory: define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.


- Builder: Builds a complex object using simple objects and using a step by step approach

## Behavioral patterns: 
Concerned with the interaction and responsibility of objects.In these design patterns,the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled.

- Observer: A way of notifying change to a number of classes


- State: State design pattern is used when an Object change its behavior based on its internal state.

- Strategy: Defines a set of encapsulated algorithms that can be swapped to carry out a specific behaviour

- Visitor: Defines a new operation to a class without change
