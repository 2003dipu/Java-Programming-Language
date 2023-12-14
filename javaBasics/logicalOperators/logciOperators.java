
/*
public class logciOperators {
    public static void main(String[] args) {
        System.out.println("Project Name: Java Logical Operators(AND, OR, NOT)");
        // logical operators = used to connect two or more expressions
        // && = (AND) both condition must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition
        // AND logical operator
        int temp = 15;
        if (temp >= 30) {
            System.out.println("It's hot outside");
        } else if (temp <= 20) {
            System.out.println("It's cold outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("The weather is good outside");
        } else {
            System.out.println("The temperature is unpredictable");
        }
    }
}
*/
/*
// OR || logical operator
import java.util.Scanner;

public class logciOperators {
    public static void main(String[] args) {
        System.out.println("Project Name: Java Logical Operators(AND, OR, NOT)");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("You are playing a game! Press q or Q to quit");
            String response = scanner.next();
            if (response.equals("q") || response.equals("Q")) {
                System.out.println("You quit the game");
            } else {
                System.out.println("You are still playing the game!");
            }
        }

    }
}
*/

// NOT ! logical operator
import java.util.Scanner;

public class logciOperators {
    public static void main(String[] args) {
        System.out.println("Project Name: Java Logical Operators(AND, OR, NOT)");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("You are playing a game! Press q or Q to quit");
            String response = scanner.next();
            if (!response.equals("q") && !response.equals("Q")) {
                System.out.println("You are still playing the game!");
            } else {
                System.out.println("You quit the game");
            }
        }
    }
}

