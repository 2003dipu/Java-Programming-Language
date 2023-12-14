import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        System.out.println("\n\n");
        System.out.println("    |\\");
        System.out.println("    | \\");
        System.out.println("    |  \\");
        System.out.println(" a  |   \\  c");
        System.out.println("    |    \\");
        System.out.println("    |_____\\");
        System.out.println("       b");
        System.out.println("\n");

        double a;
        double b;
        double c;
        // try is used to close the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter side a: ");
            a = scanner.nextDouble();
            System.out.println("Enter side b: ");
            b = scanner.nextDouble();
        }
        c = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse = c = " + c);

    }
}
