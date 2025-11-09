package com.sgtesting.Arrays;

public class Merge {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};
        int c[]=new int[a.length+b.length];
        for(int i=0;i<=a.length-1;i++){
            c[i]=a[i];
//            System.out.print(c[i]);
        } for(int i=0;i<=a.length-1;i++){
            c[a.length+i]=b[i];
//            System.out.print(c[i]);
        }for(int i=0;i<=c.length-1;i++){
            System.out.print(c[i]);
            if(i<c.length-1){
                System.out.print(",");
            }
        }

        System.out.println();
    }
}
