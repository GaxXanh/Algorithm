package com.company;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * Created by anhph on 11/23/2015.
 */
public class Draw {
    public static void main(String[] args) {
//        int N = 100;
//        StdDraw.setXscale(0, N);
//        StdDraw.setYscale(0, N * N);
//        StdDraw.setPenRadius(.01);
//        for (int i = 1; i <= N; i++) {
//            StdDraw.point(i, i);
//            StdDraw.point(i, i * i);
//            StdDraw.point(i, i * Math.log(i));
//        }
//        arrayOfRandomValues(50);
//        sortedArrayOfRandomValues(20);
//        StdDraw.point(0.1,0.4);
//        StdDraw.line(0.1, 0.4, 0.5, 0.6);
        System.out.println(
                'b'
        );
        System.out.println('b' + 'c');
        System.out.println((char) ('a' + 4));
    }

    static void arrayOfRandomValues(int N) {
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.random();
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    static int[] F;

    static int F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F[N-1] + F[N-2];
    }

    static void sortedArrayOfRandomValues(int N) {
        double[] a = new double[N];
        F = new int[N];
        for (int i = 0; i < N; i++){
            F[i] = F(i);
            a[i] = F[i];
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < N; i++) {
            double x = (double) i/40;
            double y = 0;
            double rw = 0.2 / N;
            double rh = a[i] / (double) 100;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

}
