package com.dzzxjl.sort;

import java.util.ArrayList;
import java.util.List;

public class SortTest {
    public static <T extends Comparable<T>> void bubbleSort(T[] a){
        // 1,4,7,3,2
        for (int i = 0; i <  a.length ; i++){
            for (int j = 0; j < a.length - i - 1; j++){
                if (a[j].compareTo(a[j + 1]) > 0 ) {
                    T temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
//        int[] array = new int[]{1,4, 7,3,2};
        Integer[] array = new Integer[]{1,4, 7,3,2};
 //        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(7);
//        list.add(3);
//        list.add(2);
        bubbleSort(array);
        for (Integer i : array){
            System.out.println(i);
        }
    }
}
