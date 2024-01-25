// alternative to Merge Sort 

import java.util.Arrays;

public class MergeAlternative {

    public static void main(String[] args) {

        System.out.println();

        int[] data = { 7, 5, 6, 8, 10, 9, 11, 1, 2, 4, 3 };
        int[] sortedData = mergeSort(data);
        System.out.println("Sorted data: " + Arrays.toString(sortedData));

        System.out.println();
    }

    public static int[] mergeSort(int[] data) {
        if (data.length <= 1) {
            return data; // Base case: a list of one or zero elements is already sorted
        }

        int middle = data.length / 2;
        int[] left = Arrays.copyOfRange(data, 0, middle);
        int[] right = Arrays.copyOfRange(data, middle, data.length);

        // Recursively sort the halves
        left = mergeSort(left);
        right = mergeSort(right);

        // Conquer: merge the sorted halves
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        // Copy any remaining elements from either left or right
        System.arraycopy(left, i, merged, k, left.length - i);
        System.arraycopy(right, j, merged, k, right.length - j);

        return merged;
    }
}
