package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike("BMW", "Red", 2020);
        System.out.println(bike.getModelBike() + " " + bike.getColorBike() + " " + bike.getYearRelease());

    }
}
// Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
//“Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
//использовать). Придерживаться принципов инкапсуляции и использовать ключевое
//слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
//консоль.