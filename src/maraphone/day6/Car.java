package maraphone.day6;

public class Car {
    private int yearOld;
    private String color;
    private String model;

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int old){
        return(old-yearOld);
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
