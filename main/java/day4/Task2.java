package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[100];
        for ( int i = 0; i < 100; i++){
            array[i] = rnd.nextInt(10000);
        }
        int max = 0;
        int min = 10000;
        int numzero = 0;
        int sumZero = 0;
        for ( int num: array){
            if (num > max) max = num;
            if ( num < min) min = num;
            if (num%10 == 0) {
                numzero++;
                sumZero += num;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + numzero);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumZero);

    }
}
//Создать новый массив размера 100 и заполнить его случайными числами из
//диапазона от 0 до 10000.
//Затем, используя циклы for each вывести:
//- наибольший элемент массива
//- наименьший элемент массива
//- количество элементов массива, оканчивающихся на 0
//- сумму элементов массива, оканчивающихся на 0
//Использовать сортировку запрещено.