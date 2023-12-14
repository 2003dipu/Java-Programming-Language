public class objectArray {
    public static void main(String[] args) {
        // int[] numbers = new int[3];
        // char[] characters = new char[4];
        // String[] strings = new String[5];

        System.out.println();

        //Food[] refrigerator = new Food[3];// array of objects

        Food food1 = new Food("Pizza");
        Food food2 = new Food("peanutButter");
        Food food3 = new Food("coconut");

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        // alternative to the previous assignment. instantiation
        Food[] refrigerator = {food1, food2, food3};

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

    }
}
