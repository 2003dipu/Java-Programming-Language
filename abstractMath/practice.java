
/*
 The provided code demonstrates the implementation of memoization in Java to compute Fibonacci numbers. 
 Memoization is an optimization technique that stores previously computed results to avoid redundant calculations.
 */
import java.math.BigInteger;
import java.util.HashMap;

public class practice {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("implementation of memoization in Java to compute Fibonacci numbers");

        // print the first 60 Fibonacci numbers
        allFib(70);

        System.out.println();

    }

    static void allFib(int n) {
        HashMap<Integer, BigInteger> memo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println(i + " : " + fib(i, memo));

            if (fib(i, memo).compareTo(BigInteger.valueOf(3000000000000L)) > 0) {
                System.out.println("Crossed 3 trillion");
            } else if (fib(i, memo).compareTo(BigInteger.valueOf(2000000000000L)) > 0) {
                System.out.println("Crossed 2 trillion");
            } else if (fib(i, memo).compareTo(BigInteger.valueOf(1000000000000L)) > 0) {
                System.out.println("Crossed 1 Trillion");
            } else if (fib(i, memo).compareTo(BigInteger.valueOf(4000000000L)) > 0) {
                System.out.println("Crossed 4 billion");
            } else if (fib(i, memo).compareTo(BigInteger.valueOf(3000000000L)) > 0) {
                System.out.println("Crossed 3 billion");
            } else if (fib(i, memo).compareTo(BigInteger.valueOf(2000000000)) > 0) {
                System.out.println("Crossed 2 billion");
            } else if (fib(i, memo).compareTo(BigInteger.valueOf(1000000000)) > 0) {
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

/*
 * 
 * public static void main(String[] args) {
 * // Sample text
 * String text = "java hashmap is a useful java data structure hashmap example";
 * 
 * // Split the text into words
 * String[] words = text.split(" ");
 * 
 * // Create a HashMap to store word frequencies
 * HashMap<String, Integer> wordFrequencyMap = new HashMap<>();
 * 
 * // Count the frequency of each word
 * for (String word : words) {
 * // Convert the word to lowercase to make the count case-insensitive
 * String lowercaseWord = word.toLowerCase();
 * 
 * // Update the word frequency in the map
 * wordFrequencyMap.put(lowercaseWord,
 * wordFrequencyMap.getOrDefault(lowercaseWord, 0) + 1);
 * }
 * 
 * // Print the word frequencies
 * System.out.println("Word Frequencies:");
 * for (String word : wordFrequencyMap.keySet()) {
 * int frequency = wordFrequencyMap.get(word);
 * System.out.println(word + ": " + frequency);
 * }
 * }
 */