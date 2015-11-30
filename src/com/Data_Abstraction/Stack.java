package com.Data_Abstraction;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by anhph on 11/26/2015.
 */
public class Stack<Item> implements Iterable<Item>{
    private Node first; // top of stack (most recently added node)
    private int N; // number of items

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        @Override
        public boolean hasNext() {
            return first.item == null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

//    @Override
//    public Iterator<Item> iterator() {
//        return new ListIterator();
//    }
//
//    private class ListIterator implements Iterator<Item>
//    {
//        private Node current = first;
//        @Override
//        public boolean hasNext() {
//            return current != null;
//        }
//
//        @Override
//        public Item next() {
//            Item item = current.item;
//            current = current.next;
//            return item;
//        }
//    }

    private class Node
    {
        Item item;
        Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public boolean isEmpty()
    {
        return first == null;
    }
    public int size()
    {
        return N;
    }

    public void push(Item item)
    {
        Node oldfirst = first;
        first = new Node(item, oldfirst);
        N++;
    }

    public Item pop()
    {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        for (int i = 0; i < args.length; i++)
        {
            if (!args[i].equals("-"))
                s.push(args[i]);
            else if (!s.isEmpty()) System.out.print(s.pop() + " ");
        }

        System.out.println("( " + s.size() + " left on stack)");

        Iterator<String> i = s.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next().toString());
        }
//        Iterator<String> i = s.iterator();
//        while (i.hasNext())
//        {
//            System.out.println(i.next().toString());
//        }
    }
}
