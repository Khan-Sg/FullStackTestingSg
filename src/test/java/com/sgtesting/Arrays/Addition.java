package com.sgtesting.Arrays;

public class Addition {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,1,1,1,1};
        int c[]=new int[a.length];
        for(int i=0;i<=a.length-1;i++){
            if(a.length-1==b.length-1){
                System.out.print(c[i]=a[i]+b[i]);
                if(i<a.length-1){
                    System.out.print(",");
                }
            }else{
                System.out.println("Invalid lengths ");
            }

        }
        System.out.println();
    }
}
