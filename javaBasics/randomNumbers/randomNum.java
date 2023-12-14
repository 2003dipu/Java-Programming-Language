import java.util.Random;

public class randomNum {
    public static void main(String[] args) {
        // the next program will generate a random integer between the range
        // -2,147,483,648 to 2,147,483,647 (inclusive)
        Random random = new Random();
        int x = random.nextInt();
        System.out.println(x);
    }
}