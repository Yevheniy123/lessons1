package com.company;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        //task3();


    }

    private static void task3() {
        int n = 0;
        int leng=0;
        while (true)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество строк: ");
            try
            {
                n= in.nextInt();
                break;

            }
            catch (InputMismatchException fg)
            {
                System.out.println("Вы ввели не число:(");
            }
        }
        Scanner in = new Scanner(System.in);
        String [] str = new String [n];
        for (int i=0; i<n; i++)
        {
             str[i]= in.next();
             leng +=str[i].length();

        }
        leng=leng/n;
        System.out.println("Средняя длина:"+leng);
        for (int i=0; i<n; i++)
        {
            if (str[i].length()<leng)
            {
                System.out.println(str[i]+" Длина строки: "+str[i].length());
            }
        }
    }
}
