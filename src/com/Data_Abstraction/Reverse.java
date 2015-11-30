package com.Data_Abstraction;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by anhph on 11/24/2015.
 */
public class Reverse {
    static int pnt = 0;

    public static void main(String[] args) {
        Stack<Integer> stack;
        stack = new Stack<Integer>();
        while (pnt++ < args.length - 1)
            stack.push(Integer.parseInt(args[pnt]));

        for (int i : stack)
            StdOut.println(i);
    }
}
