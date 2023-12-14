import java.util.Random;
import java.util.Scanner;

public class GuessNum {

    public static void main(String[] args) {

        long userGuess = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Generate a random long number between 1 and 1 billion (inclusive)
        long randomNumber = random.longs(1L, 1000000001L).findFirst().getAsLong();
        int counter = 1;
        while (userGuess != randomNumber) {
            System.out.print("Guess the random number -> ");
            userGuess = scanner.nextLong();
            if (userGuess == randomNumber) {
                System.out.println("Yeahhhhhhhjh -> Correct");
                System.out.println("It took you " + counter + " attempts to guess " + randomNumber);
                break;
            } else if (userGuess > randomNumber) {
                System.out.println(userGuess + " too high");
            } else if (userGuess < randomNumber) {
                System.out.println(userGuess + " too low");
            }
            counter++;
        }
        scanner.close();
    }
}

/*
import java.util.Random;

public class RandomNumber {

  public static void main(String[] args) {
    // Create an instance of Random class
    Random random = new Random();

    // Generate a random long number between 1 and 1 billion (inclusive)
    long randomNumber = random.longs(1L, 1000000001L).findFirst().getAsLong();

    // Print the generated number
    System.out.println("Random number between 1 and 1 billion: " + randomNumber);
  }
}

 */
