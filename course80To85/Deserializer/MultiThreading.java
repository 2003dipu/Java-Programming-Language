/* Project name: Multithreading java = Process of executing multiple threads simultaneously
   Helps maximum utilization of CPU
   Threds are independent, they don't affect the execution of other threads.
   An exception in one thread will not interrupt other threds.
   useful for serving multiple clients, multiplayer games, or other mutually independent tasks

 */
package Deserializer;


public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {

        DipuThread thread1 = new DipuThread();

        MyRunable runnable1 = new MyRunable();
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000);
        thread2.start();

        //System.out.println(1/0);
        
        
    }
    
}
