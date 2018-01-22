package myhashmap;

import java.util.*;

public class MyHashMap {

    // Container holds the key value pairs and record list points to an array list.
    private List<Container> recordList;

    public MyHashMap() {
        this.recordList = new ArrayList<Container>();
    }

    /* Method to put the key value pair into the list - creating a container to hold the key value
    pair then inserting the key value into the container adding the container to the list. */
    public void put(Object k, Object v) {
        Container value = new Container(); 
        value.insert(k, v); 
        recordList.add(value); 
    }

    /* Method to remove from list - by going through each object of the list and storing a pointer to the 
    container if the container consists of the key and matches the key, remove the container from the list. 
    Otherwise if the key is not found in the list, return false. */
    public boolean remove(Object k) {
        for (Object value : recordList) {
            Container val = (Container) value; 
            if (val.key.equals(k)) 
            {
                recordList.remove(value);
                return true;
            }
        }
        return false; 
    }

    // Printing the list
    public String toString() {
        String value = "";
        value = value + "[";
        for (int i = 0; i < recordList.size(); i++) {
            if (i < recordList.size() - 1) {
                value += recordList.get(i) + ", ";
            } else {
                value += recordList.get(i);
            }
        }
        value += "]";
        return value;
    }
    
    // Print MyHashMap
    public void printMyHashMap() {
        System.out.print("[");
        for (int i = 0; i < recordList.size(); i++) {
            if (i < recordList.size() - 1) {
                System.out.print(recordList.get(i) + ", ");
            } else {
                System.out.print(recordList.get(i));
            }
        }
        System.out.println("]");
    }

    /* Method to get the value given the key by going through the entire list, checking if the container consists
    of the key and matches the key. If it does return the value, otherwise if it is not found, return null. */
    public Object get(Object k) {
        for (Object value : recordList) {
            Container val = (Container) value;
            if (val.key.equals(k)) {
                return val.value; 
            }
        }
        return null; 
    }
    
    // Testing the methods
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put("aaa", 10);
        map.put("bbb", 20);
        map.put("ccc", 30);
        map.put("ddd", 40);
        System.out.println(map.get("ccc"));
        map.put("ccc", 50);
        map.remove("aaa");
        System.out.println(map.get("aaa"));
        System.out.println(map.get("bbb"));
        System.out.println(map.get("eee"));
        map.printMyHashMap();
    }
}
