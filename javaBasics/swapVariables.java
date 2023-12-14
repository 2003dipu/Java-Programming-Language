public class swapVariables{
    public static void main(String[] args){
        System.out.println("\n\nHow to swap 2 variables(real life example) taught by Bro Code. 11/11/2023\n\n");

        String x = "water";
        String y = "kool-aid";

        System.out.println("x = "+x);
        System.out.println("y = "+y);
        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping both variables");
        System.out.println("x = "+x);
        System.out.println("y = "+y);


    }
}