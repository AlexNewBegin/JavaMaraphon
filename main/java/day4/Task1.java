package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        Random rnd = new Random();
        for ( int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(10);
        }
        int eight = 0;
        int one = 0;
        int evenInt = 0;
        int oddInt = 0;
        int sum = 0;
        System.out.println("Введено число " + length + " сгенерирован следующий массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("информация о массиве:");
        System.out.println("Длина массива: " + array.length);
        for( int num: array){
            if (num > 8) eight++;
            if (num == 1) one ++;
            if (num%2 == 0) evenInt++;
            if (num%2 !=0) oddInt++;
            sum = sum + num;
        }
        System.out.println("Количество чисел больше 8: " + eight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + evenInt);
        System.out.println("Количестве нечетных чисел: " + oddInt);
        System.out.println("Сумма всех элементов массива: " + sum);


    }
}

////С клавиатуры вводится число n - размер массива. Необходимо создать массив
//        указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
//        содержимое массива в консоль, а также вывести в консоль информацию о:
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива
//        Пример:
//        Введено число 10. Сгенерирован следующий массив:
//        [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//        Информация о массиве:
//        Длина массива: 10
//        Количество чисел больше 8: 1
//        Количество чисел равных 1: 0
//        Количество четных чисел: 6
//        Количество нечетных чисел: 4
//        Сумма всех элементов массива: 46
