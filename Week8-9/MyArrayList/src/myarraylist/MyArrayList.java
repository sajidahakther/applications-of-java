package myarraylist;

public class MyArrayList {

    // Starting my array list with a stroage size of length 10, creating a object data[] to store this in 
    private static final int SIZE_FACTOR = 10;
    private Object data[];
    private int index;
    private int size;

    // The data of the array list is initialised to point to the array of Object and size of 0
    public MyArrayList() {
        this.data = new Object[SIZE_FACTOR];
        this.size = 0;
    }

    /* Method to add object to array list - if the size is eual or greater in length, extend the size of storage by 5.
    This new storage takes up the new length. I then copy the contents from the previous storage inside the new storage. */
    public void add(Object obj) {

        if (size >= data.length) {
            int newLength = size + 5;
            Object newStorage[] = new Object[newLength];
            System.arraycopy(data, 0, newStorage, 0, data.length);
            data = newStorage;
        }
        // Increasing the size by 1 by adding another item to the array
        data[size++] = obj;
    }

    /* Method to get an item from the array list - if statement used to check is the slot is within bounds, 
    if so return data (get item). Otherwise throw error by printing out "not found in list" and return null. */
    public Object get(int i) throws Exception {
        if (i <= size - 1) {
            return data[i];
        } else {
            System.out.println("Not found in list");
            return null;
        }
    }

    /* Method to remove item from array list - if statement used to check is the slot is within bounds, if so remove the
    item from the array, create new array and copy the content from the previous to the new storage and decrement size. */
    public void remove(int i) throws Exception {
        if (i <= size - 1) {
            System.arraycopy(data, i + 1, data, i, data.length - 1 - i);
            size--;
        } else {
            // System.out.println("Err");
        }
    }

    // Testing array list by adding, removing, and getting
    public static void main(String[] args) throws Exception {
        MyArrayList mal = new MyArrayList();
        mal.add("zero");
        mal.add("one");
        mal.add("two");
        mal.add("three");
        mal.add("four");
        mal.add("five");
        mal.add("six");
        mal.add("seven");
        mal.add("eight");
        mal.add("nine");
        mal.remove(16);
        
        // Testing a number within the list or not in list
        System.out.println(mal.get(9));
        System.out.println();
        System.out.println("Testing a number not in list:");
        System.out.println(mal.get(89));
    }
}
