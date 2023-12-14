
// while loop = execute a block of code as long as a condition remains true

import java.util.Scanner;
/*
public class whileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = " ";
        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        // close the scanner outside of the while loop. Close the scanner object
        scanner.close();
        System.out.println("Hello " + name);
    }
}
*/
// do while loop

public class whileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = " ";
        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());
        
        // close the scanner outside of the while loop. Close the scanner object
        scanner.close();
        System.out.println("Hello " + name);
    }
}