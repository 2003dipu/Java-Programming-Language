/* project name: Java Lambda expression
    = aks anonymous method: a shorter way to write anonymous classes with only one method
 */

public class Main {

    public static void main(String[] args) {

        String name = "I love you";
        int age = 20;

        DipuInterface myInterface = (x, y) -> {

            System.out.println("Hello World!");
            System.out.println("It is a nice day, no?\n");
            System.out.println("Do you love me?\n" + x);
            System.out.println("Are you " + y + " years old?");
        };

        DipuInterface myInterface2 = (x, y) -> {

            System.out.println("\nHello " + x + ".\nYou are " + y + " years old, right?");

        };

        myInterface.message(name, age);
        myInterface2.message("Dipu", 0);

    }
}