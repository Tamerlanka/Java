package maraphone.day9.Task_1;

public class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }

    public void printInfo(){
        System.out.println("���� ������� � ������ "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
