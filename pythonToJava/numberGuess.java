
/*
# In this number guessing game the computer is going to generate a number and the user has to guess it correctly
import random


def guess(x):
    random_number = random.randint(0, x)
    attempt = 0
    counter = 0

    while attempt != random_number:
        attempt = int(input(f'Guess my secret number between 1 and {x} : '))
        # Computer will give feedback to the user based on what user guesses
        if attempt < random_number:
            print("Dream big ")
        elif attempt > random_number:
            print("Not that big")
        counter += 1
    print(f"It took you {counter} attempts.\
YOU WIN!")


guess(1000)

 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class numberGuess {

    public void guess(int x) {

        try {

            Random random = new Random();
            int random_number = random.nextInt(x + 1);
            int attempt = -1;
            int counter = 0;
            Scanner scanner = new Scanner(System.in);

            while (attempt != random_number) {
                System.out.print("\nGuess my secret number between 1 and " + x + " : ");
                attempt = scanner.nextInt();
                // Computer will give feedback to the user based on what user guesses
                if (attempt < random_number) {
                    System.out.println("Dream big ");
                } else if (attempt > random_number) {
                    System.out.println("Not that big");
                }
                counter++;
            }
            System.out.println("\n|||||||||||||||||||||||\nIt took you " + counter + " attempts. YOU WIN!");
            System.out.println("||||||||||||||||||||||\n\n");
            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer between 1 and " + x);
            guess(x);

        }

        catch (Exception e) {
            System.out.println("An unexpected error occured: " + e.getMessage());
        }

    }

}