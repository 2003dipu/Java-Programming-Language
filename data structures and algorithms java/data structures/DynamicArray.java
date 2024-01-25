
public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int cap) {
        this.capacity = cap;
        this.array = new Object[cap];
    }

    public void add(Object data) {

        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {

        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < size - i - 1; j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;

                if (size <= (int) (capacity / 3)) {
                    shrink();
                }
                break;
            }
        }

    }

    public int search(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {

        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {

        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

        String string1 = "";

        for (int i = 0; i < capacity; i++) {
            string1 += array[i] + ", ";
        }
        if (string1 != "") {
            string1 = "[" + string1.substring(0, string1.length() - 2) + "]";
        } else {
            string1 = "[]";
        }
        return string1;
    }

}
