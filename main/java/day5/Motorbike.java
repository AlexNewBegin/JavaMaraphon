package day5;

/**
 * @author Aleksandr Labuta  23.12.2022
 */
public class Motorbike {
    private int yearRelease;
    private String colorBike;
    private String modelBike;

   public  Motorbike(String modelBike, String colorBike, int yearRelease){
        this.modelBike = modelBike;
        this.colorBike = colorBike;
        this.yearRelease = yearRelease;
    }

    public String getModelBike() {
        return modelBike;
    }
    public String getColorBike() {
        return colorBike;
    }
    public int getYearRelease(){
       return yearRelease;
    }
}
