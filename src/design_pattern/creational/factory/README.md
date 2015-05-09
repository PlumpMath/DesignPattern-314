# Factory Pattern
** A.K.A. Virtual Constructor**

## Intent
- Define an interface for creating an object, but let subclasses decide which class to instantiate. 
- Let a class defer instantiation to subclasses.

## Applicability
Use the Factory Method pattern when
- a class can't anticipate the class of objects it must create.
- a class wants its subclasses to specify the objects it creates.
- classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate.

## Participants
#### - Product
- defines the interface of objects the factory creates

#### - Concrete Product
- implements the Product interface

#### - Creator
- declares the factory method, which returns an object of specified Product Type.
- may call the factory method to create an Product object.

#### - Concrete Creator
- overrides the factory method to return an instance of a Concrete Product.

## Consequences
- **Provides hooks for subclasses.** Creating objects inside a class with a factory method is always more flexible than creating an object directly. Factory Method gives subclasses a hook for providing an extended version of an object.
- **Connects parallel hierarchies.**
- **Create object without exposing the creation logic to the client and refer to newly created object using a common interface.**

