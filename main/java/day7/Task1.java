package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2010, 10, 1000);
        Airplane airplane2 = new Airplane("Boing", 2010, 110, 1000);
        Airplane.compareAirplanes(airplane1, airplane2);

    }
}

//Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
//дня.
//В классе Самолет создать статический метод compareAirplanes, который в
//качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
//сообщение в консоль о том, какой из самолетов длиннее.