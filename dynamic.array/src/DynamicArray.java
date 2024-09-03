public class DynamicArray {

    // non-static atributes
    int size;
    int capacity = 10;
    Object[] array;

    // constructor without parameters
    public DynamicArray() {
        this.array = new Object[capacity];
    }

    // constructor with parameterrs
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    // getter for index element
    public Object get(int index) {
        return array[index];
    }

    // adding new element
    public void add(Object data) {

        if(size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    // insertion of element on parametrized index
    public void insert(int index, Object data) {

        if(size >= capacity) {
            grow();
        }

        // moving all elements with bigger index for one place in right
        for(int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        // setting insertion element on parametrized index
        array[index] = data;
        size++;
    }

    public void delete(Object data) {

        for(int i = 0; i < size; i++) {
            // moving all elements with bigger index for one place in left
            if(array[i] == data) {
                for(int j = 0; j < (size - i - 1); j++){
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                // checking size and shrinking if it is needed
                if(size <=(int) (capacity/3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {

        for(int i = 0; i < size; i++) {
            if(array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        // doubling capacity
        int newCapacity = (int)(capacity * 2);

        // creating new array with increased capacity
        Object[] newArray = new Object[newCapacity];

        // coping old array into new
        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        // changing non-static field
        capacity = newCapacity;
        // changing reference
        array = newArray;
    }

    private void shrink() {

        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        // changing non-static field
        capacity = newCapacity;
        // changing reference
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

        String string = "";

        for(int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if(string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
    }
}