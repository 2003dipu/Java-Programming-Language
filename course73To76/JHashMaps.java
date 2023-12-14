
/* project name: Java HashMap
HashMap = implements the Map interface (need import)
HashMap is similar to ArrayList, but with key-value pairs
stores objects, need to use Encapsulation
ex: (name,email), (username, userID), (country, capital)

 */
import java.util.HashMap;

public class JHashMaps {

    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<>();

        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        // System.out.println(countries);
        // countries.remove("USA");
        // countries.clear();
        // int num = countries.size();

        // System.out.println(countries.get("Russia"));
        // countries.replace("USA", "Detroit");
        // System.out.println(countries.size());
        // boolean check = countries.containsKey("England");
        // boolean check = countries.containsValue("Moscow");

        // print data in an organized way
        System.out.println();
        for (String i : countries.keySet()) {
            System.out.print(i + "\t = ");
            System.out.println(countries.get(i));
        }

    }

}
