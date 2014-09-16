package com.dp;

import java.util.NoSuchElementException;
import java.util.TreeSet;

/**
 *
 * @author Anil Jaglan
 */
public class IteratorDesignPattern<E> {

    private TreeSet<E> data = new TreeSet<E>();

    public class Iterator {

        private IteratorDesignPattern<E> idp;
        private java.util.Iterator itr;
        private E current;

        public Iterator(IteratorDesignPattern<E> idp) {
            this.idp = idp;
        }

        public void first() {
            itr = idp.data.iterator();
            next();
        }

        public void next() {
            try {
                current = (E) itr.next();
            } catch (NoSuchElementException ex) {
                current = null;
            }
        }

        public boolean isDone() {
            return current == null;
        }

        public E current() {
            return current;
        }
    }

    public void add(E in) {
        data.add(in);
    }

    public Iterator iterator() {
        return new Iterator(this);
    }
}
