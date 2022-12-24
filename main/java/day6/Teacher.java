package day6;

import java.util.Random;

/**
 * @author Aleksandr Labuta  24.12.2022
 */
public class Teacher {
    private String name;
    private String subject;

    public Teacher( String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public void evaluate(Student student){
        Random rnd = new Random();
        int grade = rnd.nextInt(4) + 2;
        String gradeText = "";
        switch (grade){
            case 2: gradeText = "неудовлетворительно"; break;
            case 3: gradeText = "удовлетворительно"; break;
            case 4: gradeText = "хорошо"; break;
            case 5: gradeText = "отлично"; break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + gradeText);

    }
}
