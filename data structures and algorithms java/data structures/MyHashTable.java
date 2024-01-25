import java.util.Hashtable;

public class MyHashTable {

    public static void main(String[] args) {

        System.out.println();
        
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Amit");
        table.put(123, "Shrabanta");
        table.put(321, "Tusar");
        table.put(555, "Shimul");
        table.put(777, "Pronoy");

        //table.remove(777);
        System.out.println("Hash Code" + "\t" + "Key" + "\t" + "Value\n");

        for( Integer key : table.keySet()){
            //System.out.println(key.hashCode() + "\t\t" + key + "\t" + table.get(key));
            System.out.println(key.hashCode() % 10 + "\t\t" + key + "\t" + table.get(key));
        }

        System.out.println();

    }
    
}
