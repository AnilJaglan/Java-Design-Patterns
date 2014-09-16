package com.dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Anil Jaglan
 */
public class IterativeDesignPattern<E> {

    private List<E> list = new ArrayList<E>();
    private int size = 0;

    public class Iterator implements java.util.Iterator<E> {

        private IterativeDesignPattern idp;
        private java.util.Iterator itr;
        private E current;
        private int cursor;
        private int lastRet = -1;

        public Iterator(IterativeDesignPattern idp) {
            this.idp = idp;
            itr = list.iterator();
            cursor = 0;
            lastRet = -1;
        }

        @Override
        public E next() {
            try {
                lastRet = cursor;
                current = (E) itr.next();
                cursor++;
            } catch (NoSuchElementException ex) {
                current = null;
                throw ex;
            }
            return current;
        }

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    public void add(E in) {
        list.add(in);
        size++;
    }

    public Iterator iterator() {
        return new Iterator(this);
    }
}
