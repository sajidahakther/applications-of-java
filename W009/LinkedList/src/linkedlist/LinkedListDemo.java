package linkedlist;

public class LinkedListDemo {

    public static void main(String[] args) {
        /* Testing file for linked list implementation, inserts number at front/back  
        of list then prints it's original unsorted list and once it's been sorted. */
        LinkedList list = new LinkedList(2);
        list.insertItemAtFront(4);
        list.insertItemAtFront(8);
        list.insertItemAtBack(5);
        list.insertItemAtBack(9);
        list.deleteItem(2);
        System.out.println("======== Unsorted List =========");
        list.printList();
        System.out.println("========= Sorted List ==========");
        list.sortListDesc();
        list.printList();
    }

}
