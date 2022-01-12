package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	order("is2 Thi1s T4est 3a");
    }
    public static String order(String words) {
        Map<Integer ,String> map = new TreeMap<Integer ,String>();

        if(words.equals(""))  return "";

        String[] arr = words.split(" ");

        for (String i : arr){
            for(int j = 0; j<i.length(); j++ ){

                if(Character.isDigit(i.charAt(j))){
                    map.put(Character.getNumericValue(i.charAt(j)),i);

                }
            }

        }
        String result = "";
        for (Map.Entry<Integer, String> e :
                map.entrySet()){
            result +=e.getValue() + " ";
        }

        return result.trim();
    }

}
