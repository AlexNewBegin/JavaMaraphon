package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int stage = sc.nextInt();
        if (0 < stage && stage <=4 ){
            System.out.println("Малоэтажный дом");
        } else if (5 <= stage && stage <= 8){
            System.out.println("Среднеэтажный дом");
        } else if ( stage >= 9){
            System.out.println("Многоэтажный дом");
        } else{
            System.out.println("Ошибка ввода");
        }
    }
}