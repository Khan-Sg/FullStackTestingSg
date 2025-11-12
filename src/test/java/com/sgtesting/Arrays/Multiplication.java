package com.sgtesting.Arrays;

public class Multiplication {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{1,2,3},{1,2,3}};
        int b[][]={{1,2,3,},{1,2,3},{1,2,3}};
        int c[][]=new int [a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];

                }

            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
            }
    }
}
