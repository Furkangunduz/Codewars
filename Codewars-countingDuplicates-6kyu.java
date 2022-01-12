package com.company;
import java.util.*;

public class Main {
    public static int duplicateCount(String text) {
        char[] charArr = text.toCharArray();
        char[] resArr = new char[charArr.length];
        Arrays.sort(charArr);

        for(int i = 1; i<charArr.length; i++){
            if(charArr[i] == charArr[i-1]){
                for(int j = 0; j<resArr.length; j++){
                    if(resArr[j] == charArr[i]){
                        break;
                    }
                    resArr[i] = charArr[i];
                }

            }
        }
        int count = 0;
        char x = resArr[0];
        for(char i : resArr){
            if(i != '\u0000' && i != x ){
                count++;
                x = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(duplicateCount("indivisibility"));
    }
}
