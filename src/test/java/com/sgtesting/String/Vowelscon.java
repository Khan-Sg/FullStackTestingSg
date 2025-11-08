package com.sgtesting.String;

public class Vowelscon {
    public static void main(String[] args) {
        String s="sdkaeiouuuh";
        int vol=0;
        int cons=0;
        for(int i=0;i<=s.length()-1;i++){
//            String s1=s.toLowerCase();
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vol++;
            }else{
                cons++;
            }
        }System.out.println("Total number of vowels is : "+vol);
        System.out.println("Total number of vowels is : "+cons);
    }
}
