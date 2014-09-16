package com.dp;

import java.util.Iterator;

/**
 *
 * @author Anil Jaglan
 * 
 */
public class DesignPatterns {

    public static void main(String[] args) {
        IterativeDesignPattern id = new IterativeDesignPattern();
        for (int i = 1; i < 10; i++) {
            id.add("a" + i);
        }
        Iterator itr = id.iterator();
        Iterator itr1 = id.iterator();
        while (itr.hasNext() && itr1.hasNext()) {
            System.out.print(itr.next() + " " + itr1.next() + " ");
        }
    }
}
