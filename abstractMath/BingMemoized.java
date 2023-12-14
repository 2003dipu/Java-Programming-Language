/*
 using memoization to improve the run time of recursion
 fibonacci numbers implementation in java
 memoize = (transitive, computing) To store (the result of a computation) so that it can be subsequently
 retrieved without repeating the computation
 memoization = (computer science) A technique in which partial results are recorded (forming a memo) and then
 can be re-used later without having to recompute them
 */

import java.math.BigInteger;
import java.util.HashMap;

public class BingMemoized {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Memoization implementation in Java to solve Fibonacci numbers");

        // print the first 40 Fibonacci numbers
        printFibonacci(500);
        

        System.out.println();

    }

    // print the Fibonacci numbers from 0 to n
    static void printFibonacci(int n) {
        // use a HashMap to store the memoized values
        HashMap<Integer, BigInteger> memo = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " : " + fibonacci(i, memo));
            

        }
    }

    // return the nth Fibonacci number using memoization
    static BigInteger fibonacci(int n, HashMap<Integer, BigInteger> memo) {
        // base cases: F(0) = 0, F(1) = 1
        if (n <= 0)
            return BigInteger.ZERO;
        else if (n == 1)
            return BigInteger.ONE;

        // check if the result is already cached
        if (memo.containsKey(n))
            return memo.get(n);

        // compute the result recursively and cache it
        BigInteger result = fibonacci(n - 1, memo).add(fibonacci(n - 2, memo));
        memo.put(n, result);
        return result;
    }

}

/*
 
An instance of HashMap has two parameters that affect its performance: initial capacity and load factor. 
The capacity is the number of buckets in the hash table, and the initial capacity is simply the capacity at the 
time the hash table is created. The load factor is a measure of how full the hash table is allowed to get before 
its capacity is automatically increased. When the number of entries in the hash table exceeds the product of the 
load factor and the current capacity, the hash table is rehashed (that is, internal data structures are rebuilt) so
 that the hash table has approximately twice the number of buckets.

As a general rule, the default load factor (.75) offers a good tradeoff between time and space costs. Higher values
decrease the space overhead but increase the lookup cost (reflected in most of the operations of the HashMap class,
including get and put). The expected number of entries in the map and its load factor should be taken into account 
when setting its initial capacity, so as to minimize the number of rehash operations. If the initial capacity is 
greater than the maximum number of entries divided by the load factor, no rehash operations will ever occur.

If many mappings are to be stored in a HashMap instance, creating it with a sufficiently large capacity will allow 
the mappings to be stored more efficiently than letting it perform automatic rehashing as needed to grow the table. 
Note that using many keys with the same hashCode() is a sure way to slow down performance of any hash table. 
To ameliorate impact, when keys are Comparable, this class may use comparison order among keys to help break ties.

Note that this implementation is not synchronized. If multiple threads access a hash map concurrently, and at least 
one of the threads modifies the map structurally, it must be synchronized externally. (A structural modification 
is any operation that adds or deletes one or more mappings; merely changing the value associated with a key that 
an instance already contains is not a structural modification.) This is typically accomplished by synchronizing on 
some object that naturally encapsulates the map. If no such object exists, the map should be "wrapped" using the 
Collections.synchronizedMap method. This is best done at creation time, to prevent accidental unsynchronized access 
to the map:

Map m = Collections.synchronizedMap(new HashMap(...));
 
 */
