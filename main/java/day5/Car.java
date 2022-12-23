package day5;

/**
 * @author Aleksandr Labuta  23.12.2022
 */
public class Car {
    private int yearRelease;
    private String color;

    private String model;

    public void setYearRelease(int yearRelease){
        this.yearRelease = yearRelease;
    }
    public int getYearRelease(){
        return yearRelease;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getcolor(){
        return color;
    }
    public void  setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

}
