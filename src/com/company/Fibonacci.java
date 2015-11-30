//package com.company;
//
//import java.math.BigInteger;
//
///**
// * Created by anhph on 11/21/2015.
// */
//public class Fibonacci {
//    static BigInteger[] i;
//    static final int I = 200;
//
//    public static BigInteger F(int N) {
//        if (N == 0) return new BigInteger(String.valueOf(0));
//        if (N == 1) return new BigInteger(String.valueOf(1));
//        return new BigInteger(String.valueOf(i[N-1].add(i[N-2])));
//    }
//
//    public static void main(String[] args) {
//        i = new BigInteger[I];
//        for (int N = 0; N < I; N++)
//        {
//            i[N] = F(N);
//            System.out.println(N + " " + i[N].toString());
//        }
//    }
//}
