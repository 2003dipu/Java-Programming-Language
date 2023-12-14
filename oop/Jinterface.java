// project: interface
/*
 In Java, the interface keyword is used to declare an interface. An interface in Java is a collection of abstract 
 methods (methods without a body), constants, and, starting from Java 8, default methods and static methods.
 In Java, an interface is a collection of abstract methods. It is a way to achieve abstraction in Java, where you 
 define a set of method signatures without providing the implementation. In addition to abstract methods, 
 interfaces can also contain constants and default methods.

 ABSTRACTION
 Abstraction is a fundamental concept in computer science and programming that involves simplifying complex systems
  by modeling classes based on their essential characteristics and behaviors. It is one of the four pillars of 
  object-oriented programming (OOP), along with encapsulation, inheritance, and polymorphism.

In the context of programming and OOP, abstraction involves creating abstract representations of objects and 
systems that capture only the essential features and behaviors relevant to the problem at hand, while ignoring or 
hiding the unnecessary details. Abstraction allows programmers to focus on the high-level design and functionality 
of a system without getting bogged down by implementation details.

There are two main aspects of abstraction:

1. **Data Abstraction:**
   - **Data Representation:** Abstraction involves representing the relevant data of an object and hiding the 
   unnecessary details. For example, consider a class representing a car. The essential data might include 
   attributes like speed, fuel level, and current gear, while details about the internal combustion engine or the 
   specifics of how the transmission works are abstracted away.
   - **Data Encapsulation:** This is closely related to abstraction. Encapsulation involves bundling the data 
   (attributes) and methods (behavior) that operate on the data into a single unit or class. Access to the internal 
   details is controlled, and only a well-defined interface is exposed to the outside world.

2. **Behavioral Abstraction:**
   - Abstraction is not just about data; it also involves abstracting the behavior of objects. This is achieved 
   through method signatures in a class or interface. The actual implementation of methods is hidden from the 
   outside world, and only the method signatures are visible, providing a clear and abstract interface for 
   interacting with objects.

In summary, abstraction is a powerful concept that allows programmers to manage complexity, improve code 
organization, and build systems that are easier to understand and maintain. It enables the creation of models 
that capture the essential aspects of a problem domain while hiding unnecessary details, promoting a more effective 
and modular approach to software development.
 */
// simply put: an interface is a template that can be applied to a class. Similar to inheritance but specifies
// what a class has/must do. Classes can apply more than one interface, whereas inheritance is limited to one
// super class

public class Jinterface {
    public static void main(String[] args) {
        // this is really cool. Sunday Pichay is interviewed by Guy Raz

        Rabbit rabbit1 = new Rabbit();
        rabbit1.flee();

        Hawk hawk1 = new Hawk();
        hawk1.hunt();

        Fish fish1 = new Fish();
        fish1.hunt();
        fish1.flee();

    }
}
