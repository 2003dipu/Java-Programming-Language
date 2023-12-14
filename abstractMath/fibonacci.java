/*
 using memoization to increase the run time of recursion
 fibonacci numbers implementation in java
 
 */
public class fibonacci {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Memoization implementation in Java to solve Fibonacci numbers");

        // print the first 20 Fibonacci numbers
        allFib(21);

        System.out.println();

    }

    static void allFib(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + " : " + fib(i, memo));
            if (fib(i, memo) > 1000000000) {
                System.out.println("Crossed 1 billion");
            } else if (fib(i, memo) < 0) {
                System.out.println("Exception has occured. Next fibonacci numbers cannot be less than 0");

            }

        }
    }

    static int fib(int n, int[] memo) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (memo[n] > 0)
            return memo[n];

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
}

/*

The reason why the message "Crossed 1 Trillion" is not shown is because of a logical error in your code. 
You have placed the else if condition for checking if the Fibonacci value is greater than or equal to 1 trillion 
after the if condition for checking if the Fibonacci value is greater than 1 billion. This means that the second 
condition will never be executed, since any value that is greater than or equal to 1 trillion is also greater than 
1 billion. To fix this, you need to swap the order of the two conditions, so that the larger value is checked 
first. Here is the corrected code:

import java.math.BigInteger;
import java.util.HashMap;

public class practice {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Memoization implementation in Java to solve Fibonacci numbers");

        // print the first 70 Fibonacci numbers
        allFib(70);

        System.out.println();
    }

    static void allFib(int n) {
        HashMap<Integer, BigInteger> memo = new HashMap<>();
        for (int i = 0; fib(i, memo).compareTo(BigInteger.valueOf(1000000000000L)) <= 0; i++) {
            BigInteger fibValue = fib(i, memo);
            System.out.println(i + " : " + fibValue);

            // swap the order of the two conditions
            if (fibValue.compareTo(BigInteger.valueOf(1000000000000L)) >= 0) {
                System.out.println("Crossed 1 Trillion");
            } else if (fibValue.compareTo(BigInteger.valueOf(1000000000)) > 0) {
                System.out.println("Crossed 1 billion");
            }
        }
    }

    static BigInteger fib(int n, HashMap<Integer, BigInteger> memo) {
        if (n <= 0)
            return BigInteger.ZERO;
        else if (n == 1)
            return BigInteger.ONE;
        else if (memo.containsKey(n))
            return memo.get(n);

        BigInteger result = fib(n - 1, memo).add(fib(n - 2, memo));
        memo.put(n, result);
        return result;
    }
}



Source: Conversation with Bing, 11/19/2023
*/