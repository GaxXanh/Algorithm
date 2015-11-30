package com.Data_Abstraction;

/**
 * Created by anhph on 11/27/2015.
 */
public class Queue<Item> {
    private Node first = null;
    private Node last = null;
    private int N;

    private class Node
    {
        Item item;
        Node next;

        public Node(Item item, Node next)
        {
            this.item = item;
            this.next = next;
        }
    }

    public boolean isEmpty(){
        return first.item == null;
    }

    public int size(){
        return N;
    }

    public void enqueue(Item item)
    {
        Node oldLast = last;
        last = new Node(item, null);
        if (isEmpty()) first = last;
        oldLast.next = last;
        N++;
    }

    public Item dequeue()
    {
        Item item = first.item;
        first = first.next;
        if (!isEmpty())
            N--;
        else last = null;
        return item;
//        Item item = first.item;
//        first = first.next;
//        if (isEmpty()) last = null;
//        N--;
//        return item;
    }
}
