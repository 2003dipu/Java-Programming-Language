// exception = an unexpected event that occurs during the execution of a program that disrupts the normal 
// flow of instructions

import java.util.Scanner;

public class handleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int a = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println("Result = " + c);

        } catch (Exception e) {
            System.out.println("Error : " + e);
        } finally {
            scanner.close();
        }
    }
}
