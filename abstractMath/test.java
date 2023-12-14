
import java.math.BigInteger;
import java.util.HashMap;

public class test {

    public static void main(String[] args) {

        System.out.println();

        HashMap<Integer, BigInteger> memo = new HashMap<>();

        memo.put(1, new BigInteger("90"));
        memo.put(2, new BigInteger("80"));
        memo.put(3, new BigInteger("70"));

        for (Integer key : memo.keySet()) {
            BigInteger value = memo.get(key);
            System.out.println("Key : " + key + ", Value: " + value);
        }

        // Or, to access a specific value
        BigInteger valueForKey2 = memo.get(2);
        System.out.println("Value for key 2: " + valueForKey2);
        // ---------------------------------------------------------------
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1, "Dipu Singha");
        names.put(2, "Rosmi Sinha");
        names.put(3, "Anushka Sinha");

        System.out.println();

        for (Integer key : names.keySet()) {
            System.out.println(key + " " + names.get(key));
            
        }



        System.out.println();

    }
}
