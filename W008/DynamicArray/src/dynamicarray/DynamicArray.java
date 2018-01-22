package dynamicarray;

public class DynamicArray {

    private static final int SIZE_FACTOR = 10;
    private Object data[];
    private Object element[];
    private int index;
    private int size;
    int numOfElements;

    public DynamicArray() {
        this.data = new Object[SIZE_FACTOR];
        this.size = SIZE_FACTOR;
        numOfElements = 0;
    }

    public void add(Object obj) {
        if(this.size == numOfElements) {
            extendArray();
        }
        data[numOfElements] = obj;
        numOfElements++;
    }

    public Object get(int i) throws Exception {
        return data[i];
 
    }

    public void remove(int i) throws Exception {
    for (int j =i; j <this.size-1; j++) {
            data[j] = data[j+1];
        }
    }
    
    public void extendArray() {
        this.size = SIZE_FACTOR;
        this.size = this.size * 2;
        element = new Object[this.size];
        for (int i = 0; i <numOfElements; i++) {
            element[i] = data[i];
        }
        data = element;
    }

    public static void main(String[] args) throws Exception {
        DynamicArray mal = new DynamicArray();
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
        mal.remove(6);
        System.out.println(mal.get(8));
    }
}
