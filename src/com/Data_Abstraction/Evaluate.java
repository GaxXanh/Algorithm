package com.Data_Abstraction;

import edu.princeton.cs.algs4.DoublingRatio;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * Created by anhph on 11/24/2015.
 */
public class Evaluate {
    static String s;
    static String[] aEx;
    static int length;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        aEx = args[0].split(" ");
        length = aEx.length;
        for (int pnt = 0; pnt < length; pnt++) {
            s = aEx[pnt];
            if (s.equals("("));
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            } else vals.push(Double.parseDouble(s));

        }
        StdOut.println(vals.pop());
    }
}
