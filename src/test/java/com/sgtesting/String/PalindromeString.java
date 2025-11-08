package com.sgtesting.String;

public class PalindromeString {
    public static void main(String[] args) {
        String s="Madam";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);
        if(s.equalsIgnoreCase(rev)){
            System.out.println(rev+" : Is Palindrome");
        }else{
            System.out.println(rev+" : Is not Palindrome");
        }
    }
}
