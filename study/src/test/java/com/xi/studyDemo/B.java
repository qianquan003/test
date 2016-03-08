package com.xi.studyDemo;

public class B {
     static public void main(String[] args) {
        int i = 12;
//        i += i -= i *= i;
        System.out.println(i += i -= i *= i);//等效于12+12-12*12
        System.out.println(17<<1);
    }
    protected int method1(int a, int b) { return 0; }
}