

public class DaMain {

    public static void main(String[] args) {
        
        DynamicArray dArray = new DynamicArray(5);

        //System.out.println(dArray.capacity);
        dArray.add("A");
        dArray.add("B");
        dArray.add("C");
        dArray.add("D");
        dArray.add("E");
        dArray.add("F");

        dArray.delete("A");
        dArray.delete("B");
        dArray.delete("C");

        //dArray.insert(0, "X");
        //dArray.delete("A");
        //System.out.println("Index of C is: "+dArray.search("C"));
        
        System.out.println(dArray);
        System.out.println("Size: " + dArray.size);
        System.out.println("capacity: " + dArray.capacity);
        System.out.println("empty: " + dArray.isEmpty());
    }
    
}
