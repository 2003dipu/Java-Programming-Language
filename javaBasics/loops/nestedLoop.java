
// nested loop = a loop inside of another loop
import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        String symbol = "";
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter symbol to use: ");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();

            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);

            }
        }
        scanner.close();
    }
}
