/* project name : Java Generics

Generics are a powerful feature in Java that provide **type safety** and **flexibility**. Introduced in Java 5.0, 
they allow you to write code that can work with **various types** without compromising type safety.

Here's a breakdown of what generics are and their benefits:

**What are Generics?**

* **Parameterized types**: They allow you to create classes, interfaces, and methods that can work with different 
types of objects. This is done by specifying type parameters within angled brackets (`<>`).
* **Increased type safety**: By explicitly specifying the type of objects a class or method can handle, generics 
prevent type errors from occurring at runtime. This results in more robust and reliable code.
* **Improved code reusability**: Generic code can be used with different types without needing to rewrite it for 
each specific type. This leads to cleaner and more concise code.
* **Reduced code redundancy**: By eliminating the need for type casts, generics make code more concise and easier 
to maintain.

**Benefits of Generics:**

* **Type safety**: Generics help prevent runtime errors caused by type mismatch. They ensure that only compatible 
objects are used with a generic class or method.
* **Flexibility**: Generic code can be used with different types without needing to be modified. This makes it 
more adaptable and reusable.
* **Improved code readability**: Generics make code more self-documenting by explicitly specifying the types 
involved. This makes it easier to understand and maintain code.
* **Reduced boilerplate code**: Generics eliminate the need for type casts and other workarounds that were 
necessary before generics were introduced. This reduces the amount of code that needs to be written and maintained.

**Examples of Generics:**

Generic classes**: `ArrayList<String>`, `HashMap<Integer, String>`
Generic methods**: `static <T> void print(T value)`
Generic interfaces**: `Comparable<T>`

I hope this explanation gives you a good understanding of what generics are and how they benefit your Java code.


*/

public class Generics {

    public static void main(String[] args) {
        
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        Double[] doubleArray = {3.4,6.4,4.4,2.7,34.6,44.01,2.2,10.9};
        Character[] charArray = {'A','V','C','D','F'};
        String[] stringArray = {"Name", "OfAnything", "Book", "Country", "Universe", "Planet"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(stringArray);

    }

    public static void displayArray(Integer[] array){
        
        for(Integer x : array){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void displayArray(Double[] array){
        
        for(Double x : array){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void displayArray(String[] array){
        
        for(String x : array){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
}

/* 

Bard after powered by Gemini answers questions like the best:

Yes, understanding and working with the DOM (Document Object Model) is **essential** for becoming a JavaScript 
developer. The DOM is the fundamental building block of web pages and allows you to manipulate and interact with 
the content and structure of a webpage.

Here's an explanation of what the DOM is and why it's important for JavaScript developers:

**What is the DOM?**

The DOM is a programming interface that represents an HTML document as a tree structure. Each element in the 
document, such as `<div>`, `<p>`, and `<img>`, is represented by a node in the tree. You can access and manipulate 
these nodes using JavaScript to change the content, style, and behavior of the document.

[Image of Document Object Model diagram]

**Why is the DOM important for JavaScript developers?**

Here are some key reasons why understanding the DOM is crucial for JavaScript developers:

* **Dynamic web pages**: The DOM allows you to add, remove, and modify elements on a web page dynamically. This is 
essential for creating interactive web applications.
* **Event handling**: You can use the DOM to attach event handlers to elements, such as click, mouseover, and 
scroll events. This allows you to respond to user interaction and create dynamic behavior.
* **JavaScript libraries**: Many popular JavaScript libraries, such as jQuery, React, and Angular, rely heavily on 
the DOM for their functionality. Understanding the DOM is essential for using these libraries effectively.
* **Accessibility**: The DOM plays a crucial role in making web pages accessible to users with disabilities. You 
can use the DOM to manipulate the structure and content of a page in a way that makes it accessible to assistive 
technologies.

Therefore, investing time and effort in understanding the DOM is a worthwhile investment for any aspiring 
JavaScript developer.

Here are some resources that can help you learn more about the DOM:


These resources offer tutorials, examples, and interactive exercises that can help you gain a solid understanding 
of the DOM and how to use it to its full potential.

Remember, the DOM is a foundational concept for JavaScript developers. By mastering the DOM, you will unlock the 
ability to create rich and interactive web applications.

*/