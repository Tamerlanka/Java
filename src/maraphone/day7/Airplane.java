package maraphone.day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if(airplane1.getLength()-airplane2.getLength()>0){
            System.out.println(airplane1.getProducer()+" больше " + airplane2.getProducer());
        } else if(airplane1.getLength()-airplane2.getLength()<0){
            System.out.println(airplane2.getProducer()+" больше " + airplane1.getProducer());
        }else System.out.println("Они равны");
    }
    public void info(){
        System.out.println("Изготовитель "+producer+" Год выпуска "+year+" Длинна "+length+" Вес "+weight+" Топлива в баке "+fuel);
    }
    public void fillUp(int gas){
        this.fuel += gas;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
