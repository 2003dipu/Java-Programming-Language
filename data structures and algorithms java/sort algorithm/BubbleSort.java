// bubble sort algorithm implementation in java

public class BubbleSort {

    public static void main(String[] args) {

        System.out.println();

        int array[] = { 7, 5, 6, 8, 9, 0, 1, 2, 4, 3 };

        System.out.println("Unsorted array");

        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();

        System.out.println("\nSorted array");
        bubbleSortAlgorithm(array);
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");

    }

    public static void bubbleSortAlgorithm(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;                    
                }
            }
        }
    }
}
