package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b == 0) break;
            System.out.println(a / b);
        }
    }
}

//Реализовать программу, которая пока работает, принимает на вход от пользователя
//два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
//результат деления и выводит его в консоль. Программа останавливает свою работу
//тогда, когда пользователь вводит 0 в качестве делителя.