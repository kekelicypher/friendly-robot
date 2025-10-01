package School;

public class Student extends Occupant {
    int level;
    String course;


    Student(String name, int age, String sex, String course) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;

    };

    public void printDetails() {
        System.out.printf("Name: %s, Age: %d, Sex: %s, Course: %s\n", name, age, sex, course);
    }

    
}
