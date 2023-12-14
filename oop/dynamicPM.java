//project:  dynamic polymorphism 
// dynamic = after compilation (during runtime)
// polymorphism = many shapes/ forms

import java.util.Scanner;

public class dynamicPM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println("1. Dog  2. Cat : ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println(choice + " is invalid");
            animal.speak();
        }
        scanner.close();

    }

}
