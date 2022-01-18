package com.company;

public class Main {
    public static int zeros(int n) {
        int count = 0;
        while(n >= 5){
            count += (int) n/5;
            n /= 5;
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(zeros(99));
    }
}
