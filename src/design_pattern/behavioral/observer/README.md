# Observer Pattern (A.K.A. Publish-Subscribe, Dependents)

## Intent
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Applicability
Use the Observer pattern in any of the following situations:
- When an abstraction has two aspects, one dependent on the other.Encapsulating these aspects in separate objects lets you vary and reuse them independently.
- When a change to one object requires changing others, and you don't know how many objects need to be changed.
- When an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled.

## Participants
### Subject
- knows its observers. Any number of Observer objects may observe a subject.
- provides an interface for attaching and detaching Observer objects.

### Observer
- defines an updating interface for objects that should be notified of changes in a subject.

### ConcreteSubject
- stores state of interest to ConcreteObserver objects.
- sends a notification to its observers when its state changes.

### ConcreteObserver
- **maintains a reference to a ConcreteSubject object**.
- stores state that should stay consistent with the subject's.
- implements the Observer updating interface to keep its state consistent with the subject's.

## Consequences
- **Abstract coupling between Subject and Observer.** All a subject knows is that it has a list of observers, each conforming to the simple interface of the abstract Observer class.The subject doesn't know the concrete class of any observer. Thus the coupling between subjects and observers is abstract and minimal.
- **Support for broadcast communication.** Unlike an ordinary request, the notification that a subject sends needn't specify its receiver. The notification is broadcast automatically to all interested objects that subscribed to it. The subject doesn't care how many interested objects exist; its only responsibility is to notify its observers. This gives you the freedom to add and remove observers at any time. It's up to the observer to handle or ignore a notification.
- **Unexpected updates.** Because observers have no knowledge of each other's presence, they can be blind to the ultimate cost of changing the subject. A seemingly innocuous operation on the subject may cause a cascade of updates to observers and their dependent objects. Moreover, dependency criteria that aren't well-defined or maintained usually lead to spurious updates, which can be hard to track down.


