package com.company;



public class Main2 {
    public static void main(String[] args) {
        //Обмен двух переменных местами

        int a=3;
        int b=5;

        System.out.println("a = "+a+" b = " +b);

        a = a + b;
        b = a - b;
        a = a - b;



        System.out.println("a = "+a+" b = " +b);
    }
}