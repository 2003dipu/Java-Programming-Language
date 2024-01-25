// Project name: Merge sort algorithm implementation in Java

public class MergeSort {

    public static void main(String[] args) {

        System.out.println();

        int[] array = { 7, 5, 6, 8, 10, 9, 11, 1, 2, 4, 3 };

        mergeSortAlgorithm(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
    }

    private static void mergeSortAlgorithm(int[] array) {

        int length = array.length;
        if (length <= 1)
            return; // base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;// left array index or indices
        int j = 0; // right array index

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSortAlgorithm(leftArray);
        mergeSortAlgorithm(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        // check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }

        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}

/*
 * merge sort = recursively divide array in 2, sort, re-combine
 * run-time complexity = O(n log n)
 * space complexity = O(n)
 */

 /*
------------------------ Merge Sort Algorithm explanation in details ------------------------ -------------------

         **Here's an explanation of merge sort:**

**Key Concepts:**

- **Divide and Conquer Algorithm:** It breaks down a problem into smaller, more manageable subproblems, 
solves those, and then combines the solutions to solve the overall problem.
- **Stable Sort:** It preserves the relative order of elements with equal keys.

**Steps:**

1. **Divide:**
   - Recursively divide the unsorted array into two halves until each subarray contains only one element 
   (which is inherently sorted).

2. **Conquer:**
   - Repeatedly merge the subarrays back together in a sorted manner:
     - Compare the first elements of each subarray.
     - Place the smaller element into the resulting merged array.
     - Advance to the next element in the subarray that had the smaller element.
     - Repeat until one subarray is empty.
     - Append the remaining elements from the non-empty subarray to the merged array (they are already in order).


**Example:**

Consider the array `[6, 5, 3, 1, 8, 7, 2, 4]`.

1. Divide:
   - Subarrays: `[6, 5, 3, 1]` and `[8, 7, 2, 4]`
   - Further divide: `[6, 5]`, `[3, 1]`, `[8, 7]`, `[2, 4]`
   - Continue until individual elements: `[6]`, `[5]`, `[3]`, `[1]`, `[8]`, `[7]`, `[2]`, `[4]`

2. Conquer (merging):
   - Merge `[6]` and `[5]` to get `[5, 6]`
   - Merge `[3]` and `[1]` to get `[1, 3]`
   - Merge `[5, 6]` and `[1, 3]` to get `[1, 3, 5, 6]`
   - Merge `[8]` and `[7]` to get `[7, 8]`
   - Merge `[2]` and `[4]` to get `[2, 4]`
   - Merge `[7, 8]` and `[2, 4]` to get `[2, 4, 7, 8]`
   - Final merge: `[1, 3, 5, 6]` and `[2, 4, 7, 8]` to get the sorted array `[1, 2, 3, 4, 5, 6, 7, 8]`

**Key Advantages:**

- **Efficient:** It has a time complexity of O(n log n) in all cases, making it suitable for large datasets.
- **Stable:** It preserves the original order of equal elements, which is important in certain applications.
- **Works well with external storage:** It can be adapted to sort data too large to fit in memory by using 
external storage devices.

**Common Use Cases:**

- Sorting large datasets
- Handling external data
- Implementing efficient sorting algorithms in libraries and frameworks
- Situations where stability is crucial

  */
