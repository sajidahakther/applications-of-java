package com.company;
import java.util.*;

public class Myclass {
    private void method(ArrayList<String> s) {
        Stack<String> words = new Stack<String>();
        Iterator<String> iter = s.iterator();
        while (iter.hasNext()){
            words.push(iter.next());
        }
        String result = "";
        while (!words.isEmpty()) {
            result = result + " " + words.pop();
        }
        System.out.println(result);
    }

}
