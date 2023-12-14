import java.util.ArrayList;

public class forEach {
    public static void main(String[] args){
        // for-each = traversing technique to iterate through the elements in an array/collection
        // less steps, more readable, less flexible

        //String[] animals = {"cat","dog", "fish", "rat", "bird", "cows"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("fish");
        animals.add("rat");
        animals.add("bird");
        animals.add("cows");
        for(String i: animals){
            System.out.println(i);
        }
    }
}
