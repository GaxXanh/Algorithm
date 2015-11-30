package com.Data_Abstraction;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;
//import sun.util.calendar.BaseCalendar;

/**
 * Created by anhph on 11/24/2015.
 */
public class demo {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        Date date = new Date(m, d, y);
        StdOut.println(date);
    }
}
