package com.company;

public class Main {

    public static void main(String[] args) {
	createSpiral(4);
    }

    public static int[][] createSpiral(int N) {
        if(N<1)
            return new int[0][0];

        int n = N*2;
        int m = 1;
        int[][] res = new int[N][N];

        int top = 0; int left = 0;
        int bottom = N-1; int right = N-1;


        while(true) {
            for (int i = left; i <= right; i++) {
                res[top][i] = m++;
            }
            top++;
            if(top>bottom) break;

            for (int i = top; i <= bottom; i++) {
                res[i][right] = m++;
            }
            right--;
            if(left>right) break;


            for (int i =right; i >= left; i--) {
                res[bottom][i] = m++;
            }
            bottom--;
            if(top>bottom) break;

            for (int i = bottom; i >= top; i--) {
                res[i][left] = m++;
            }
            left++;
            if(left>right) break;
        }
    return res;
    }
}
