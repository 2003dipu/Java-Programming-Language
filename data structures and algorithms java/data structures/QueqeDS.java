import java.util.LinkedList;
import java.util.Queue;

public class QueqeDS {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen"); // enque
        queue.offer("Chad");
        queue.offer("Amit");
        queue.offer("Steve Jobs");

        //System.out.println(queue.isEmpty());
        System.out.println(queue.contains("Amit"));

        //System.out.println(queue.peek());
        //queue.poll(); // deque

        //System.out.println(queue);


    }
}

/*
 * Queqe = FIFO data structure, first in, first out
 */