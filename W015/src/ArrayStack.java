import java.lang.*;

public class ArrayStack {

    // Creating a private object array, private integer count and initialising the maximum number to 100.
    private Object[] a;
    private int c;
    public static final int m = 100;

    // The array first takes up the maximum value, and the counter starts off from 0.
    public ArrayStack(Object[] a, int c) {
        a = new Object[m];
        c = 0;
    }

    public Object top() {
        return a[c - 1];
    }

    public void pop() {
        switch (c--) {
        }
    }

    public void push(Object obj) {
        a[c++] = obj;
    }

    public boolean isEmpty() {
        return c == 0;
    }
}
