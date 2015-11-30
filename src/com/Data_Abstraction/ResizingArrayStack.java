package com.Data_Abstraction;

import java.util.Iterator;

/**
 * Created by anhph on 11/26/2015.
 */
public class ResizingArrayStack<Item> implements Iterable<Item>{

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty() { return N == 0; }
    public int size() { return N; }

    private void resize(int max)
    {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }

    public void push(Item item)
    {
        if (N == a.length) resize(2*a.length);
        a[N++] = item;
    }

    public Item pop()
    {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length/4) resize(a.length/2);
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        public void remove() {}
    }

    public static void main(String[] args) {
        ResizingArrayStack<String> n = new ResizingArrayStack<>();
        for (int i = 0; i < args.length; i++)
            n.push(args[i]);
        Iterator<String> i = n.iterator();
        while (i.hasNext())
        {
            String s = i.next();
            System.out.println(s);
        }
    }
}
