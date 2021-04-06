package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        boolean check = true;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        final long startTime = System.currentTimeMillis();
        for (Integer i : arrayList) {
            check = check && arrayList.contains(i);
        }
        final long endTime = System.currentTimeMillis();

        final long durationMs = endTime - startTime;
        if (durationMs > 1000) {
            System.out.println("Total execution time: " + (durationMs / 1000.0) + "s");
        } else {
            System.out.println("Total execution time: " + (durationMs) + "ms");
        }
    }
}
