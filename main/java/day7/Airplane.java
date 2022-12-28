package day7;

/**
 * @author Aleksandr Labuta  24.12.2022
 */
public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public double getLength() {
        return length;
    }

    public double getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String info() {
        return "Изготовитель: " + producer + " , год выпуска: " + year + " , длина: " + length + " , вес: " + weight + " , количество топлива в баке: " + fuel;
    }

    public void fillUp(double fuel) {
        this.fuel += fuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        } else if (airplane2.getLength() > airplane1.getLength()){
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }
}
