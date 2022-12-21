package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matrice = new int[12][8];
        for (int x = 0; x < matrice.length; x++){
            for(int y = 0 ; y < matrice[x].length; y++){
                matrice[x][y] = rnd.nextInt(50);
                System.out.print(matrice[x][y] + "\t");
            }
            System.out.println();
        }
        int sumMax=0;
        int index = 0;
        for (int x = 0; x < matrice.length; x++) {
            int sum = 0;
            for (int y = 0; y < matrice[x].length; y++) {
                sum = sum + matrice[x][y];
            }
            System.out.println("Сумма в строке " + x + " = " + sum);
            if (sum > sumMax ) {
                sumMax = sum;
                index = x;
            }
        }
        System.out.println("Индекс строки в которой сумма максивальна: " + index);
    }
}

// Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
//матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
//В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
//строк несколько, вывести индекс последней из них.
//Пример сгенерированной матрицы (для простоты m=3, n=5):
//3 2 1 5 7 // сумма - 18
//1 2 5 6 2 // сумма - 16
//3 4 9 6 4 // сумма - 26
//Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
