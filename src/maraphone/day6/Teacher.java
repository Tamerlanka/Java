package maraphone.day6;

import java.util.Random;

public class Teacher {
    Random rand = new Random();
    private String name;
    private String subject;

    public void evaluate(Student persona){
        int a = rand.nextInt(4)+2;
        String b=null;
        if(a==5){
            b = "Отлично!";
        } else if(a==4){
            b = "Хорошо";
        } else if(a==3){
            b = "Удовлетворительно";
        } else if(a==2){
            b = "Неудовлетворительно";
        }
        System.out.println("Преподаватель "+this.name+" оценил студента "+persona.getName()+" по предмету "+this.subject+" на оценку "+b);
    }


    public void Prepod(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
