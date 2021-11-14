package com.metanit;
import java.util.Scanner;
public class lab_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите порядковый номер месяца: ");
        int month = in.nextInt();
        if (month/3==1)
            System.out.println("Время года: весна");
        else if (month/3==2)
            System.out.println("Время года: лето");
        else if (month/3==3)
            System.out.println("Время года: осень");
        else
            System.out.println("Время года: зима");



    }
}
