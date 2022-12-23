package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("Red");
        car.setModel("Audi");
        car.setYearRelease(2020);
        System.out.println(car.getModel() + " " + car.getcolor() + " " + car.getYearRelease());
    }
}

//Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
//Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
//задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
//Созданный вами класс должен отвечать принципам инкапсуляции.
