package com.company;
import java.util.*;

public class Main {

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<a.length; i++){
            arr.add(a[i]);
        }

        List<Integer> arr2 = new ArrayList<Integer>();
        for(int i = 0; i<b.length; i++){
            arr2.add(b[i]);
        }
        List<Integer> arr3 = new ArrayList<Integer>();


        for(int y: arr){
            if(!arr2.contains(y)){
                arr3.add(y);
            }
        }
        int[] res = new  int[arr3.size()];
        int x =0;

        for(int i :arr3){
            res[x++] = i;
        }
        return res;
    }
}
