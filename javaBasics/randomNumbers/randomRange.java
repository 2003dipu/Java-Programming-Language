import java.util.Random;

public class randomRange {

    public static void main(String[] args) {
        // the next programs will generate a random integer between 1 through 6
        Random random = new Random();
        int a = random.nextInt(6) + 1;
        System.out.println(a);

        int b = random.nextInt(6) + 1;
        System.out.println(b);

        int c = random.nextInt(6) + 1;
        System.out.println(c);

        int d = random.nextInt(6) + 1;
        System.out.println(d);

        int e = random.nextInt(6) + 1;
        System.out.println(e);

        int f = random.nextInt(6) + 1;
        System.out.println(f);

        // random decimal numbers between 0 through 1
        double g = random.nextDouble();
        System.out.println(g);

        // random boolean either true or false
        boolean h = random.nextBoolean();
        System.out.println(h);
    }
}
