package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setYearRelease(2010);
        System.out.println(car.yearDifference(2000));
        Motorbike bike = new Motorbike("Kawasaki", "Black", 2018);
        bike.info();
        System.out.println(bike.yearDifference(2020));

    }
}
//В классах Автомобиль и Мотоцикл реализовать два метода:
//info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//yearDifference() - принимает на вход число (год), и возвращает разницу между
//переданным годом и годом выпуска транспортного средства