package com.company;
import java.util.*;
import java.util.Collections;


// https://www.codewars.com/kata/555624b601231dc7a400017a/train/java

public class Main {

    public static void main(String[] args) {
	System.out.println(josephusSurvivor(7,3));
    }
    public static int josephusSurvivor(final int n, final int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 1; i <= n; i++){
            arr.add(i);
        }

        int count = 0;
        int x = 0;

        A :while(x<n){
            for(int i = 0; i<arr.size(); i++){
                if (x == n-1 ){
                    break A;
                }
                count++;
                if(arr.get(i) == 0)
                    count--;

                if(count == k){
                    arr.set(i,0);
                    x++;
                    count =0;
                }
            }
        }
        int res =0;
        for(int i :arr){
            if(i != 0){
                res =i;
            }
        }        return res;
    }
}
