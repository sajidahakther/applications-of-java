package myhashmap;

public class Container {

    // Created variables to store key and value
    Object key;
    Object value;

    public void insert(Object k, Object v) {
        this.key = k;
        this.value = v;
    }

    // Prints the key value
    public String toString() {
        return key + "=" + value;
    }
}
