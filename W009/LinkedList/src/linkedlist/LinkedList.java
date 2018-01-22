package linkedlist;

import java.util.*;

public class LinkedList {

    private Node head;

    public LinkedList(int item) {
        head = new Node();
        head.value = item;
        head.link = null;
    }

    // Adds item to the back of the list, if the head is equal to null, add a new node to the head.
    public boolean insertItemAtBack(int item) {
        if (head == null) {
            Node headNode = new Node();
            headNode.value = item;
            head = headNode;
            return true;
        }

        /* Creating a pointer that starts from the head of the list, travels through 
        the linked list until it reaches the end whereby currentNode.link equals null. */
        Node currentNode = head;
        while (currentNode.link != null) {
            currentNode = currentNode.link;
        }

        // Reached the end, now adding a new node to the end of the list.
        Node newNode = new Node();
        newNode.value = item;
        currentNode.link = newNode;
        return true;
    }

    /* Add item to the front of the list y creating a new head node and making the old head 
    become second in value in the list, then changing the pointer to link to the new head node. */
    public boolean insertItemAtFront(int item) {
        Node headNode = new Node();
        headNode.value = item;
        headNode.link = head;
        head = headNode;
        return true;
    }
    
    /* Deletes item from the list, if the head node is equal to null then it returns false 
    as we however if there is a value, it takes the place of 'item' and it returns true. */
    public boolean deleteItem(int item) {
        if (head == null) {
            return false;
        }
        if (head.value == item) {
            head = head.link;
            return true;
        }

        // Staring from the head of the list, I cycle through the list and stop just before the item I wish to delete
        Node currentNode = head;
        while (currentNode.link != null) {
            if (currentNode.link.value == item) {
                currentNode.link = currentNode.link.link;
                return true;
            }
            currentNode = currentNode.link;
        }
        return false;
    }

    /* Print the numbers/items in the list, by starting from the head of the linked list and  
    cycling through, printing out the vaue of the current node then moving onto the next node. */
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.link;
        }
    }
    
    /* Sorting the list out in descending order, i've first created an array list sotring all the numbers/items,
    i start from the head then cycle through - adding current node to array list the moving onto the next node*/
    public void sortListDesc() {
        ArrayList<Integer> list = new ArrayList<>();

        Node currentNode = head;
        while (currentNode != null) {
            list.add(currentNode.value);
            currentNode = currentNode.link;
        }
        
        // Sorting the array list and reversing it, pointing to the head of list, and starting from the first index in array list.
        Collections.sort(list);
        Collections.reverse(list);
        currentNode = head;
        int i = 0;
        
        // While the current node is not null, put the vaue of the current node in array list into the linked list then move to next node value.
        while (currentNode != null) {
            currentNode.value = list.get(i);
            currentNode = currentNode.link;
            i++;
        }
    }

    class Node {
        private int value;
        private Node link;
    }

}
