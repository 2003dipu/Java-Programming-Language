
// Project Name: Linear Search -> O(n) = runtime complexity is linear

public class LinearSearch {

    public static void main(String[] args) {

        System.out.println();

        int[] array = { 2, 5, 7, 9, 1, 0, 2, 20, 10, 99, 54, 76, 44 };
        int index = LinearSearchFunction(array, 11);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
        System.out.println();
    }

    private static int LinearSearchFunction(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}