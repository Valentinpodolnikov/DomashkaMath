package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Задача на счастливый билет

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Введите номер билета: ");

        try {
            number = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Ошибка. Введите номер билета");
            return;
        }


        int digit1 = number / 100000;             //1 число
        int digit2 = (number % 100000) / 10000;   //2 число
        int digit3 = (number % 10000) / 1000;     //3 число
        int digit4 = (number % 1000) / 100;       //4 число
        int digit5 = (number % 100) / 10;         //5 число
        int digit6 = (number % 10) ;              //6 число


        int sume = digit1+digit2+digit3;

        int sume2 = digit4+digit5+digit6;

        if (sume == sume2){
            System.out.println("У вас счастливый билет!");
        }
        else {
            System.out.println("У вас обычный билет! :( ");
        }




    }
}
