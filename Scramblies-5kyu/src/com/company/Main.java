package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        scramble2("aabbcamaomsccdd","commas");
    }

    public static boolean scramble2(String str1, String str2) {
        for(int i = 0; i < str2.length(); i++) {

            if(str1.contains(str2.substring(i, i+1))) {
                str1 = str1.replaceFirst(str2.substring(i, i+1), "");
            }else {
                return false;
            }
        }

        return true;

    }

    }

