package com.Data_Abstraction;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * Created by anhph on 11/24/2015.
 */
public class Stats
{
    static int i = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        Bag<Double> numbers = new Bag<>();
        while (i < args.length)
            numbers.add(Double.parseDouble(args[i++]));
        int N = numbers.size();

        for (double x : numbers)
            System.out.print(x + " ");

        numbers.add(123.3);
        System.out.println();
        for (double x : numbers)
            System.out.print(x + " ");

        double sum = 0.0;
        for (double x : numbers)
            sum += x;
        double mean = sum/N;

        sum = 0.0;
        for (double x : numbers)
            sum += (x - mean)*(x - mean);
        double std = Math.sqrt(sum/(N-1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);
    }
}
