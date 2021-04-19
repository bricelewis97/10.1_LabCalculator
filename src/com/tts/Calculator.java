package com.tts;


public class Calculator {
    int num1;
    int num2;
    char operator;


    public void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void subtract (int num1, int num2){
        System.out.println(num1 - num2);
    }

    public void divide(int num1, int num2){
        System.out.println(num1 / num2);
    }

    public int square (int num1){
        System.out.println(num1* num1);

        return num1;
    }




}