package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        Main m = new Main();
        int N = 12;
        double[] a;
        a = new double[N];
        double[] b = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = Math.round(Math.random() * 100);
            b[i] = Math.round(Math.random() * 100);
        }
        System.out.println("Array A - " + Arrays.toString(a));
        System.out.println("Array B - " + Arrays.toString(b));




//        // find the maximum of the array values
//        m.findMaximum(a);
//
//        // compute the average of the array values
//        m.computeAverage(a);
//
//        // copy to another array
//        m.copyToAnotherArray(a);
//
//        // reverse the elements within an array
//        m.reverseArray(a);
//
//        // matrix-matrix multiplication
//        m.multiplicationMatrix(a, b);

//        StdRandom r = new StdRandom();


    }

    void findMaximum(double[] a) {
        double max = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i] > max) max = a[i];
        System.out.println("Max : " + max);
    }

    void computeAverage(double[] a) {
        int N = a.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++)
            sum += a[i];
        double average = sum / N;
        System.out.format("Average: %.2f", average);
        System.out.println();
    }

    void copyToAnotherArray(double[] a) {
        int N = a.length;
        double[] b = new double[N];
        for (int i = 0; i < N; i++)
            b[i] = a[i];
    }

    void reverseArray(double[] a) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++) {
            double temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - i - 1] = temp;
        }
        System.out.println("Reversed array :" + Arrays.toString(a));
    }

    void multiplicationMatrix(double a[], double b[]) {
        int N = a.length;
        double[] c = new double[N];
        for (int i = 0; i < N; i++)
            c[i] = a[i] * b[i];
        System.out.println("Array C - " + Arrays.toString(c));
    }

}
