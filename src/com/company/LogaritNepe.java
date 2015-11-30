package com.company;

import com.oracle.webservices.internal.impl.encoding.StreamDecoderImpl;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by anhph on 11/21/2015.
 */
public class LogaritNepe {
    static final int I = 20;

    static long F(int N) {
        if (N == 1 || N == 0) return 1;
        return N * F(N - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Math.log(F(I)));
        int[] a = new int[10];
        for (int i = 0; i < 10; i ++){
            a[i] = (int) Math.round(Math.random() * 10);
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a,0,a.length);

    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }
}
