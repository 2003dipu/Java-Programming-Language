
/* 
class Second {


  public static void main(String[] args) {

    
    Practice myCar = new Practice();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
    



  }
}



class Person {
    protected String fname = "John";
    protected String lname = "Doe";
    protected String email = "john@doe.com";
    protected int age = 24;
}

class Student extends Person {
    private int graduationYear = 2018;

    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}
*/

// Code from filename: Main.java
// abstract class
abstract class Learn {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
  }
  
  // Subclass (inherit from Main)
  class Student extends Learn {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
      System.out.println("Studying all day long");
    }
  }
  // End code from filename: Main.java
  
  // Code from filename: Second.java
  public class Second{
    public static void main(String[] args) {
      // create an object of the Student class (which inherits attributes and methods from Main)
      Student myObj = new Student();
      
      
  
      System.out.println("Name: " + myObj.fname);
      System.out.println("Age: " + myObj.age);
      System.out.println("Graduation Year: " + myObj.graduationYear);
      myObj.study(); // call abstract method
      
      
    }

    
  }

