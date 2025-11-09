package com.sgtesting.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int a[]={62,1,11,123,22,12,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            }for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]);
            if(i<a.length-1){
                System.out.print(",");

            }
        }
        System.out.println();
        }
    }

