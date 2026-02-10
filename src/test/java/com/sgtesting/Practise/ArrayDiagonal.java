package com.sgtesting.Practise;

public class ArrayDiagonal {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{11,1,3},{12,11,1}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j){
                    System.out.print(a[i][j]);
                }
            }
        }
    }
}
