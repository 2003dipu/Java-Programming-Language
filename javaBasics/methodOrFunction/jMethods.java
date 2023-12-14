// method = a blockk of code that is executed whenever it is called upon

public class jMethods {
    /*
     * public static void main(String[] args) {
     * String name = "Rosmi Sinha";
     * int age = 20;
     * hello(name, age);
     * 
     * }
     * 
     * static void hello(String name, int age) {
     * System.out.println("Hello " + name);
     * System.out.println("You are " + age);
     * }
     */
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        int z = add(x, y);
        System.out.println(z);

    }

    static int add(int x, int y) {
        int z = x + y;
        return z;
    }
}
