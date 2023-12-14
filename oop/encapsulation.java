/*
 In Java, encapsulation is one of the four fundamental Object-Oriented Programming (OOP) concepts, alongside 
 inheritance, polymorphism, and abstraction. Encapsulation is the bundling of data (attributes) and 
 methods (functions) that operate on the data into a single unit known as a class. It involves restricting access 
 to some of an object's components and only exposing what is necessary.
 */

public class encapsulation {
    public static void main(String[] args) {
        Gari gari = new Gari("Chevrolet", "Camero", 2021);

        gari.setYear(2022);

        System.out.println(gari.getMake());
        System.out.println(gari.getModel());
        System.out.println(gari.getYear());

    }

}
