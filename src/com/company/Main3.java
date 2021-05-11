package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Задача "Зарплата"

        int zarplata1;
        int zarplata2;
        int zarplata3;

        Scanner input = new Scanner(System.in);


        System.out.print("Введите зарлпату 1-го сотрудника: ");

        try {
            zarplata1 = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Введите зарплату цифрами");
            return;
        }


        System.out.print("Введите зарлпату 2-го сотрудника: ");

        try {
            zarplata2 = input.nextInt();
        }
        catch (Exception e){
            System.out.println("Введите зарплату цифрами");
            return;
        }



        System.out.print("Введите зарлпату 3-го сотрудника: ");
        try{
            zarplata3 = input.nextInt();

        }
        catch (Exception e){
            System.out.println("Введите зарплату цифрами");
            return;
        }



        if (zarplata1 > zarplata2 && zarplata1 > zarplata3 && zarplata2 > zarplata3){
            //1 самая большая, 3 самая маленькая
           int  raznica = zarplata1 - zarplata3;
            System.out.println("Разница самой большой и маленькой зарплаты: "+raznica);
        }

        else if  (zarplata1 > zarplata3 && zarplata1 > zarplata2 && zarplata3 > zarplata2){
            //1 самая большая, 2 самая маленькая
            int raznica = zarplata1 - zarplata2;
            System.out.println("Разница самой большой и маленькой зарплаты: "+raznica);
        }

        else if  (zarplata2 > zarplata3 && zarplata2 > zarplata1 && zarplata3 > zarplata1){
            //2 самая большая, 1 самая маленькая
            int raznica = zarplata2 - zarplata1;
            System.out.println("Разница самой большой и маленькой зарплаты: "+raznica);
        }

        else if (zarplata2 > zarplata1 && zarplata2> zarplata3 && zarplata1 > zarplata3){
            //2 самая большая, 3 самая маленькая
            int raznica = zarplata2 - zarplata3;
            System.out.println("Разница самой большой и маленькой зарплаты: "+raznica);
        }

        else if (zarplata3 > zarplata2 && zarplata3 > zarplata1 && zarplata2 > zarplata1){
            //3 самая большая, 1 самая маленькая
            int raznica = zarplata3 - zarplata1;
            System.out.println("Разница самой большой и маленькой зарплаты: "+raznica);
        }

        else if (zarplata3 > zarplata1 && zarplata3 > zarplata2 && zarplata1 > zarplata2) {
            //3 самая большая, 2 самая маленькая
            int raznica = zarplata3 - zarplata2;
            System.out.println("Разница самой большой и маленькой зарплаты: "+raznica);
        }


    }
}
