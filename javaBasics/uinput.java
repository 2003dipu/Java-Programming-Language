import java.util.Scanner;// scanner class is found within the utility package

public class uinput {
    public static void main(String[] args) {
        System.out.println("Project Name: How to accept user input in Java?");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = scanner.nextLine();
        System.out.print("How old are you?: ");
        int age = scanner.nextInt();
        scanner.nextLine();// clearing out the scanner
        System.out.print("What is your favorite food?: ");
        String food = scanner.nextLine();

        System.out.println("\n\nHello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food + "\n\n");

    }
}
