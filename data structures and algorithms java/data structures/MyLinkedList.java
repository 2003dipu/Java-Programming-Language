import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {
        
        LinkedList<String> myLinkedList = new LinkedList<>();

        System.out.println();

        /*
        myLinkedList.push("A");
        myLinkedList.push("B");
        myLinkedList.push("C");
        myLinkedList.push("D");
        myLinkedList.push("F");
        

        //myLinkedList.pop();

        
        System.out.println(myLinkedList);

         */

        myLinkedList.offer("A");
        myLinkedList.offer("B");
        myLinkedList.offer("C");
        myLinkedList.offer("D");
        myLinkedList.offer("F");

        //myLinkedList.pop();
        //myLinkedList.poll(); // same as pop()

        System.out.print(" Index of D = ");
        System.out.println(myLinkedList.indexOf("D"));
        myLinkedList.add(4,"E");

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.peekFirst());
        System.out.println(myLinkedList.peekLast());

        myLinkedList.addFirst("0");
        myLinkedList.addLast("G");
        System.out.println(myLinkedList);

        System.out.println();

        String first = myLinkedList.removeFirst();
        System.out.println(first);

        String last = myLinkedList.removeLast();
        System.out.println(last);
        

        System.out.println();
        
    }
    
}
