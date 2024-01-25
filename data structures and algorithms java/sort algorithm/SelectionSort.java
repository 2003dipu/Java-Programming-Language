// project name: Selection sort

public class SelectionSort {

    public static void main(String[] args) {

        System.out.println();

        int array[] = { 7, 5, 6, 8, 9, 0, 1, 2, 4, 3 };

        selectionSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }  

        System.out.println("\n");
    }

    private static void selectionSort(int[] array) {

        for(int i = 0; i < array.length - 1;i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    
}
