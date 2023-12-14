// java Generics

public class AlternativeGenerics {

    public static void main(String[] args) {
        
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        Double[] doubleArray = {3.4,6.4,4.4,2.7,34.6,44.01,2.2,10.9};
        Character[] charArray = {'A','V','C','D','F'};
        String[] stringArray = {"Name", "OfAnything", "Book", "Country", "Universe", "Planet"};

        //displayArray(intArray);
        //displayArray(doubleArray);
        //displayArray(charArray);
        //displayArray(stringArray);
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));       
    }

    public static <T> void displayArray(T[] array){
        
        for(T x : array){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array){
        return array[0];
    }
    
}
