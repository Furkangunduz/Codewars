package com.company;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
        solution("abcdef");
        }

        public static String[] solution(String s) {
            ArrayList<String> arr = new ArrayList<String>();
            String x = "";
            int count = 1;

            for (char i : s.toCharArray()){
                if(count == 2){
                    x += i ;
                    arr.add(x);
                    x="";
                    count = 1;
                    continue;

                }
                x +=i;
                count++;

            }if(x.length() > 0){
                x+="_";
                arr.add(x);
            }
            String[] array = arr.toArray(new String[0]);
            return array;
        }

}
