public class arithmeticExpr {
    public static void main(String[] args) {
        System.out.println("\nProject Name: Arithmetic expressions in Java\n");

        // expressions = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %
        int friends = 10;
        friends = friends + 1;
        friends++;// increment by 1 11 +1 = 12
        System.out.println("I have " + friends + " friends");
        friends -= 6;
        System.out.println("After 6 friends are gone, now I have " + friends + " friends");
        int x = 3;
        int y = friends % 3;
        System.out.println("6 % 3 = " + y);
        System.out.println("That means 6 is evenly divided by 3 has no remainder.");
        int z = 3 * x;
        z *= 5;
    }
}
