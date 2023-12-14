import java.util.Random;

/*
// using local parameter
public class diceRoller {
    diceRoller() {
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
*/
// alternative with global variable
public class diceRoller {
    Random random;
    int number = 6;

    diceRoller() {
        random = new Random();
        roll();
    }

    private void roll() {
        number = random.nextInt(number) + 1;
        System.out.println(number);
    }
}