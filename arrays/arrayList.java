import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // ArrayList = a resizable array.
        // Elements can be added or removed after compilation phase
        // Store reference data types
        ArrayList<String> food = new ArrayList<String>();
        food.add("Jambura");
        food.add("Jombol");
        food.add("Chambhut");
        food.add("Irolpa");
        food.add("Punimulpi Jul");

        food.set(0, "Sushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

    }
}
