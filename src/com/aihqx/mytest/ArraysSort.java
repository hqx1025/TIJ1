package com.aihqx.mytest;

import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {

        int[] ary = {25,3,1,30,17};
//        insertSort(ary);
        bubbleSort(ary);
        System.out.print(Arrays.toString(ary));

        System.out.println("Hello World!");
    }




    public static void insertSort(int[] ary){
        int i,j,k;
        for (i = 1; i < ary.length; i++) {
            k = ary[i];
            for (j = i-1; j >=0 && ary[j] >k ; j--) {
                ary[j+1] = ary[j];
            }
            ary[j+1] = k;
        }
    }

    public static void bubbleSort(int[] ary){
        for (int i = 0; i < ary.length-1; i++) {
            for (int j = 0; j < ary.length-1-i; j++) {
                if (ary[j]>ary[j+1]) {
                    int t = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = t;
                }
            }
        }
    }
}

