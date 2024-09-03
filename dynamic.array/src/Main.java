public class Main {
    public static void main(String[] args) {
        /** In Java dynamic array is ArrayList<>
        *   But here I will create my own dynamic array for learning purposes and practice.
         */

        /** Advantages:
        1. Random access of elements O(1)
        2. Good locality of reference and data cache utilization
        3. Easy to insert/delete at the end
         */

        /** Disadvantages:
        1. Wastes more memory - creating new array with increased capacity
        2. Shifting elements is time consuming O(n)
        3. Expanding/shrinking is time consuming O(n)
         */

        // instatiating DynamicArray class
        DynamicArray dynamicArray = new DynamicArray();


        System.out.println("Checking is my array empty: " + dynamicArray.isEmpty());

        // adding elements in array
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");

        // printing
        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
        System.out.println("Checking is my array empty: " + dynamicArray.isEmpty());

        // checking methods
        System.out.println("Element on index 0 is: " + dynamicArray.get(0));

        System.out.println("Insertion of element X on index 0");
        dynamicArray.insert(0, "X");

        System.out.println(dynamicArray);

        System.out.println("Deleting element A");
        dynamicArray.delete("A");
        System.out.println(dynamicArray);

        System.out.println("Index of element C is: "+ dynamicArray.search("C"));

    }
}