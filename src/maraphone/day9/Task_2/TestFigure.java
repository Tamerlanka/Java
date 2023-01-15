package maraphone.day9.Task_2;

public class TestFigure {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("red", 10, 10, 10),
                new Triangle("green", 10, 20, 30),
                new Triangle("red", 10, 20, 15),
                new Rectangle("red", 5, 10),
                new Rectangle("orange", 40, 15),
                new Circle("red", 4),
                new Circle("red", 10),
                new Circle("blue", 5)
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

        public static double calculateRedPerimeter(Figure[] figures) {   //полиморфизм позволяет принимать любую из фигур
            double summ = 0;
            for (Figure fig : figures) {
                if (fig.getColor().equals("red"))
                    summ = summ + fig.perimeter();
            }
            return summ;
        }
            public static double calculateRedArea (Figure[]figures){
                double redArea = 0;
                for (Figure fig : figures) {
                    if (fig.getColor().equals("red"))
                        redArea = redArea + fig.area();
                }
                return redArea;
            }
        }
