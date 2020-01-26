package com.sparta.mb.javabasic;

public class Palindrome {
    String a;
    String b;


    public Palindrome(String a) {
        if (a == "") {
            throw new IllegalArgumentException("Can't have an empty string!");
        }
        this.a = a;
    }

    public boolean reverser() {
        StringBuilder stringBuilder = new StringBuilder(a);
        return a.equals(stringBuilder.reverse().toString().toLowerCase());

    }
}
