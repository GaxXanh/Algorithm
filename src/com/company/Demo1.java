package com.company;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by anhph on 11/23/2015.
 */
public final class Demo1 {
    // random double value in [a,b)
    public static double uniform(double a, double b)
    {
        return a + StdRandom.random() * (b - a);
    }
    // random int value in [0..N)
    public static int uniform(int N)
    {
        return (int) (StdRandom.random() * N);
    }

    public static int uniform(int lo, int hi)
    {
        return  lo + StdRandom.uniform(hi - lo);
    }

    public static int discrete(double[] a)
    {
        double r = StdRandom.random();
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
            if (sum >= r) return i;
        }
        return -1;
    }

    public static void shuffle(double[] a)
    {
        int N = a.length;
        for (int i = 0; i < N; i ++)
        {
            int r = i + StdRandom.uniform(N-i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
