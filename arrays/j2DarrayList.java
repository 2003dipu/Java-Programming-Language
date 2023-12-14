import java.util.*;

public class j2DarrayList {
    // 2D ArrayList = a dynamic list of lists
    // You can change the size of these lists during runtime
    public static void main(String[] args){

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>(); // 2D ArrayList

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("Garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("jombol");
        fruitList.add("Jambura");
        fruitList.add("coconut");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(fruitList);


        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(2));

    }

}
