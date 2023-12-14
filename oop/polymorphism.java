// project : polymorphism in java
/*
 polymorphism = greek word for poly- many, mprph- form
 The ability of an object to identify as more than one type
 Broad explanation : 
Polymorphism in Java is a powerful feature that allows you to perform a single action in different ways. It is 
derived from two Greek words: "poly" and "morphs," which mean "many forms." In other words, polymorphism is the 
ability of an object to take on many forms. This means that you can have a method or operator that can work with 
different types of objects.

There are two main types of polymorphism in Java:

Method overloading: This occurs when a class has multiple methods with the same name but different parameters. 
The compiler determines which method to call based on the number and types of arguments passed to the method.

Method overriding: This occurs when a subclass inherits a method from a parent class and redefines it to provide 
different behavior. The method that is called is determined at runtime, based on the type of object that is being 
referenced.

Polymorphism is a key feature of object-oriented programming (OOP) because it allows you to write code that is more 
reusable and flexible. For example, you can write a method that can calculate the area of any shape, even though 
there are different types of shapes (such as circles, squares, and triangles). This is because the method can take 
an object of any type that implements the Shape interface, and then call the appropriate method for that shape.

Polymorphism is also a powerful tool for design patterns. For example, the Strategy pattern uses polymorphism to 
allow you to change the behavior of an algorithm at runtime. This can be useful for things like sorting algorithms,
where you may want to use a different sorting algorithm depending on the type of data you are sorting.
 */

public class polymorphism {
    public static void main(String[] args) {

        Singha muni = new Singha();
        Sinha jela = new Sinha();
        Rosmi rosmi = new Rosmi();

        Monipuri[] manu = { muni, jela, rosmi };
        for (Monipuri x : manu) { // polymorphism implemented here
            x.go();
        }
    }

}
