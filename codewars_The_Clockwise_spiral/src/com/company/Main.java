package com.company;

public class Main {

    public static void main(String[] args) {
	createSpiral(4);
    }

    public static int[][] createSpiral(int N) {
        int[][] res = new int[N][N];

        int top = 0;int left = 0;
        int right =  N-1; int bottom = N-1;

        int num = 1;

        while(true){
            for(int i = left; i<=right;i++){
                res[top][i] = num++;
            }
            top++;

            if(top> bottom) break;


            for(int i = top; i<=bottom;i++){
                res[i][right] = num++;
            }
            right--;

            if(left> right) break;

            for(int i = right; i>=left; i--){
                res[bottom][i]=num++;
            }
            bottom--;

            if(top>bottom) break;

            for(int i = bottom; i>=top; i--){
                res[i][left] = num++;
            }
            left++;

            if(left>right) break;

        }
        return res;
    }
}
