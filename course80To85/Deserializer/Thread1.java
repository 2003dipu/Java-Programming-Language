// project name: Java Threads
/* 
A thread of execution in a program(kind of like a virtual CPU)
The JVM allows an application to have multiple threads running concurrently.
Each thread can execute parts of your code in parallel with the main thread and each thread has  its own proprity.
Thread with higher proprity are executed in preference compared to thread with a lower proprity.
The JVM Machine continutes to execute threads until either of the following occurs
    1. The exit method of class Runtime hasbeen called
    2. All user threads have died
*/
package Deserializer;

public class Thread1 {

    /*
    public static void main(String[] args) throws InterruptedException {

        // System.out.println(Thread.activeCount());

        // Thread.currentThread().setName("Mainnnnnnn");
        // System.out.println(Thread.currentThread().getName());

        // Thread.currentThread().setPriority(10);
        // System.out.println(Thread.currentThread().getPriority());

        // System.out.println(Thread.currentThread().isAlive());

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);

        }
        System.out.println("You are done");

    }
     */


     public static void main(String[] args) {
        
        MyThread thread2 = new MyThread();

        
        //thread2.start();
        //thread2.run();

        //System.out.println(thread2.isAlive());
        //thread2.setName("2nd Thread");
        //System.out.println(thread2.getName());
        //Thread.currentThread().setPriority(10);

        //thread2.setPriority(1);
        //System.out.println(thread2.getPriority());
        //System.out.println(Thread.activeCount());

        // Daemon Thread = is a low priority thread that runs in background to perform tasks such as garbage
        // collection. JVM terminates itself when all user threads(non-daemon thread)  finish their execution

        thread2.setDaemon(false);
        thread2.start();

        System.out.println(thread2.isDaemon());

     }


}
