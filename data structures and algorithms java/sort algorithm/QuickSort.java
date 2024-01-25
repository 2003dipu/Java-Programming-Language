// Project name: Quick Sort algorithm implementation in Java. It's a recursive , divide and conquer algorithm

public class QuickSort {

    public static void main(String[] args) {

        System.out.println();

        int[] data = { 7, 5, 6, 8, 10, 9, 11, 1, 2, 4, 3 };
        quicikSortAlgorithm(data, 0, data.length - 1);
        for (int i : data) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }

    private static void quicikSortAlgorithm(int[] data, int start, int end) {

        if (end <= start)
            return; // base case
        int pivot = partition(data, start, end);
        quicikSortAlgorithm(data, start, pivot - 1);
        quicikSortAlgorithm(data, pivot + 1, end);
    }

    private static int partition(int[] data, int start, int end) {

        int pivot = data[end];
        int i = start - 1;

        for(int j = start; j <= end - 1; j++){
            if (data[j] < pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        i++;
        int temp = data[i];
        data[i] = data[end];
        data[end] = temp;

        return i;
    }

}

/*
Quick sort = moves smaller elements to left of a pivot
            recursively dividearray in 2 partitions


 Runtime complexity = Best case O(n log(n))
                                O(n log(n))
                     Worst Case O(n^2) if already sorted
Space complexity = O(log(n)) due to recursion

 */