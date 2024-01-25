import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

    public static void main(String[] args) {

        //Queue<Double> queue = new LinkedList<>();
        //Queue<Double> queue = new java.util.PriorityQueue<>();
        Queue<Double> queue = new java.util.PriorityQueue<>(Collections.reverseOrder());
        //Queue<String> queueGPA = new java.util.PriorityQueue<>();
        Queue<String> queueGPA = new java.util.PriorityQueue<>(Collections.reverseOrder());
        
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.5);
        queue.offer(5.0);
        queue.offer(4.95);
        queue.offer(4.55);
        queue.offer(2.66);
        queue.offer(3.45);

        queueGPA.offer("E");
        queueGPA.offer("D");
        queueGPA.offer("A");
        queueGPA.offer("F");
        queueGPA.offer("C");
        queueGPA.offer("B");

        while(!queueGPA.isEmpty()){
            //System.out.println(queue.poll());
            System.out.println(queueGPA.poll());

        }
        

    }
    
}
/*
priority queue data structures = a  FIFO data structure, first in, first out,
 */