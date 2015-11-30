//package com.company;
//
///**
// * Created by anhph on 11/20/2015.
// */
//public final class Demo {
//
//    //    absolute value of an int value
//    public static int abs(int x) {
//        if (x < 0) return -x;
//        else return x;
//    }
//
//    //    absolute value of a double value
//    public static double abs(double x) {
//        if (x < 0.0) return -x;
//        else return x;
//    }
//
//    //    primality test
//    public static boolean isPrime(int N) {
//        if (N < 2) return false;
//        for (int i = 2; i * i <= N; i++)
//            if (N % i == 0) return false;
//        return true;
//    }
//
//    //    square root (Newton's method)
//    public static double sqrt(double c) {
//        if (c < 0) return Double.NaN;
//        double err = 1e-15;
//        double t = c;
//
//        while (Math.abs(t - c / t) > err * t) {
//            t = (c / t + t) / 2.0;
//            System.out.format("");
//        }
//        return t;
//    }
//
//    //    hypotenuse of a right triangle
//    public static double hypotenuse(double a, double b) {
//        return Math.sqrt(a * a + b * b);
//    }
//
//    //    Harmonic number
//    public static double H(int N) {
//        double sum = 0.0;
//        for (int i = 1; i <= N; i++)
//            sum += 1.0 / i;
//        return sum;
//    }
//
//    //    1.1.16
//    public static String exR1(int n) {
//        if (n <= 0) return "";
//        return exR1(n - 3) + n + exR1(n - 2) + n;
//    }
//
//    public static String exR2(int n) {
//        String s = exR2(n - 3) + n + exR2(n - 2) + n;
//        if (n <= 0) return "";
//        return s;
//    }
//
//    public static int mystery(int a, int b) {
//        if (b == 0) return 0;
//        if (b % 2 == 0) return mystery(a + a, b / 2);
//        return mystery(a + a, b / 2) + a;
//    }
//
//    public static int mysteryA(int a, int b) {
//        if (b == 0) return 1;
//        if (b % 2 == 0) return mysteryA(a * a, b / 2);
//        return mysteryA(a * a, b / 2) + a;
//    }
//}
