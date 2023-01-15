package maraphone.day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int old){
        return(old-year);
    }

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;

    }
}
