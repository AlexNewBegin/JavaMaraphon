package day8;

import java.time.Duration;
import java.time.Instant;

public class Task1 {
    public static void main(String[] args) {
        String concat = "";
        Instant start = Instant.now();
        for ( int i = 0; i <=20000; i++){
            concat = concat + i + " ";
        }
        Instant end = Instant.now();
        //System.out.println(concat);
        System.out.println(" Метод конкатенанции занял: " + Duration.between(start, end).toMillis());

        StringBuilder sb = new StringBuilder();
        Instant start1 = Instant.now();
        for( int i = 0; i <=20000; i++){
            sb.append(i);
            sb.append(" ");
        }
        Instant end1 = Instant.now();
        //System.out.println(sb);
        System.out.println(" Метод через StringBuilder занял: " + Duration.between(start1, end1).toMillis());


    }
}

// Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна
//строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
//(0 + “ “ + 1 + “ “ + 2 + … + 20000).
//После создания такой строки, вызов System.out.println() на этой строке должен
//вывести в консоль сразу все числа из диапазона:
//0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
//Для того, чтобы почувствовать разницу в производительности между конкатенацией
//обычных строк (класс String) и использовании StringBuilder, реализуйте
//описанную задачу этими двумя способами, замеряя время работы программы.
