// generic methods and generic classes

import java.util.ArrayList;
import java.util.HashMap;

public class Generics1 {

    /*
     * public static void main(String[] args) {
     * 
     * 
     * Player player = new Player();
     * Enemy enemy = new Enemy();
     * Item item = new Item();
     * Tree tree = new Tree();
     * 
     * draw(player);
     * draw(enemy);
     * draw(item);
     * draw(tree);
     * }
     * 
     * public static <Thing> void draw(Thing x){
     * x.draw();
     * 
     * }
     */

     /*
    // Generic classes
    public static void main(String[] args) {

        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1,9);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14,1.01);
        MyGenericClass<Character, Character> myChar = new MyGenericClass<>('#', '$');
        MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", '!');

        //ArrayList<String> myFriends = new ArrayList<>();
        //HashMap<Integer, String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }
     */
    // Bounded types = you can create the objects of a generic class to have data of specific derived types ex. Num

    public static void main(String[] args) {

        BoundedGeneric<Integer, Integer> myInt = new BoundedGeneric<>(1,9);
        BoundedGeneric<Double, Double> myDouble = new BoundedGeneric<>(3.14,1.01);
        

        //ArrayList<String> myFriends = new ArrayList<>();
        //HashMap<Integer, String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        

    }

}
