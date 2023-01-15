package maraphone.day9.Task_2;

public class Triangle extends Figure {
    public double sideA;
    public double sideB;
    public double sideC;
    public Triangle(String color, double sideA, double sideB, double sideC){
        super(color);
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    @Override
    public double area(){
        double temp = perimeter()/2;
        return Math.sqrt(temp*(temp-sideA)*(temp-sideB)*(temp-sideC));
    }
    @Override
    public double perimeter() {
        return sideA+sideB+sideC;
    }
}
