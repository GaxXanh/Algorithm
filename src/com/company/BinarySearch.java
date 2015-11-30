package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by anhph on 11/23/2015.
 */
public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int[] arraySort(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);

        int count = 0;
        while (sc.hasNextInt()) {
            count++;
            sc.nextInt();
        }
        int[] a = new int[count];
        sc.reset();
        sc = new Scanner(file);
        for (int i = 0; i < count; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        return a;
    }

    public static void main(String[] args) throws IOException {

        int[] whitelist = arraySort("src\\com\\company\\tinyW.txt");

        File file = new File("src\\com\\company\\tinyT.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNext())
        {
            int key = sc.nextInt();
            if (rank(key, whitelist) < 0)
                System.out.println(key);
        }
//        Arrays.sort(whitelist);
//        while (!StdIn.isEmpty())
//        {
//            int key = StdIn.readInt();
//            if (rank(key, whitelist) < 0)
//                StdOut.println(key);
//        }
    }
}
