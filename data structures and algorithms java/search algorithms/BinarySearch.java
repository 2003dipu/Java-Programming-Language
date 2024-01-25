// Binary search -> Run time complexity = O(log n), needs to be sorted before BS


public class BinarySearch {

    public static void main(String[] args) {

        int[] array = new int[1000];
        int target = 100;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        
        //int index = Arrays.binarySearch(array, target);
        int index = MybinarySearch(array, target);
        if (index == -1) {
            System.out.println( target + " not found");           
        }
        else{
            System.out.println("Element found at : " + index);
        }
        

    }

    private static int MybinarySearch(int[] array, int target) {

        int low = 0, high = array.length - 1;
        int steps = 1;

        while (low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            
            System.out.println("Middle: " + value + "\t Steps: " + steps);
            

            if (value < target) {
                low = middle;
                steps++;           
            }
            else if (value > target) {
                high = middle - 1;
                steps++;
            }
            else{
                return middle; // target found
            }
            
        }
        return -1;  // target not found
    }
    
}
