package maraphone.day9.Task_2;

public class Rectangle extends Figure{
    public int width;
    public int height;
    public Rectangle(String color, int width, int height){
        super(color);
        this.width=width;
        this.height=height;
    }
    @Override
    public double area() {
        return width*height;
    }
    @Override
    public double perimeter() {
        return 2*(width+height);
    }
}
