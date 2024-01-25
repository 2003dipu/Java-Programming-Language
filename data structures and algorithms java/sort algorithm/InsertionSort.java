// project name: Insertion sort ( with Bro Code YouTube channel)

public class InsertionSort {

    public static void main(String[] args) {

        System.out.println();

        int array[] = { 7, 5, 6, 8, 9, 0, 1, 2, 4, 3 };

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;                
            }
            array[j+1] = temp;
        }
    }

}
/*
Insertion Sort = after comparing elements to the left, shift elements to the right to make room to 
                      insert a value

                    Worst Case Run Time complexity = quadratic time O(n^2)
                    less steps than Bubble sort
                    Best case RTC O(n)

 */