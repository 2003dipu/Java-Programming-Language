
package CalculateExecutionTime;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        //
        long start = System.nanoTime();

        // -------------- Program ----------------
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // --------------------------------------

        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(duration + " ms");

        System.out.println();
    }

}
/*
This is how to calculate the runtime of a program in Java Computer programming language
 */