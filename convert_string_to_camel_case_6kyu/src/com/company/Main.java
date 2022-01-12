
package com.company;
import java.lang.StringBuilder;


public class Main {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }


    public static String toCamelCase(String s){
        String[] arr = s.split("-|\\_");
        String res = "";

        res+=arr[0];
        for(int i = 1; i < arr.length; i++){
            res+= arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
        }

        return res;
    }
}


