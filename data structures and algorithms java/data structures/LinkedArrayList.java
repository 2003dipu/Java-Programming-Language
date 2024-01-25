import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArrayList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elaspedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // LinkedList-----------------------------------------------------------
        startTime = System.nanoTime();
        //linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);
        //linkedList.remove(0);
        linkedList.remove(500000);
        // do something
        endTime = System.nanoTime();
        elaspedTime = endTime - startTime;

        System.out.println("Linked List:\t" + elaspedTime + " ns"); // Linked List: 300 ns Linked List: 11200 ns

        // LinkedList-----------------------------------------------------------
        startTime = System.nanoTime();
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        arrayList.remove(500000);
        // do something
        endTime = System.nanoTime();
        elaspedTime = endTime - startTime;

        System.out.println("Array List:\t" + elaspedTime + " ns");
        // Linked List:    11800 ns
        //  Array List:    7800 ns
        // Conclusion1: Array List is faster than Linked List in searching element
        // Conclusion2: Linked List is faster than Array List in removing first element and last element
        // Conclusion3: Array List is faster than Linked List in removing  middle element

    }

}
