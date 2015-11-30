package com.exercise;

/**
 * Created by anhph on 11/24/2015.
 */
public class exercise_119 {
    final static int NUM = 45;
    static String s = "";
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(NUM));

        for (int n = NUM; n > 0; n /= 2)
            s = (n%2) + s;
        System.out.println(s);
    }
}
