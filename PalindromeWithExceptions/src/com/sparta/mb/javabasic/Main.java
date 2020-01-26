package com.sparta.mb.javabasic;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Palindrome palindrome = new Palindrome("");

            System.out.println(palindrome.reverser());
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
