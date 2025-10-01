package School;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Mishiwo Emmanuel", 22, "Male", "Information and Communication Technology");

        Staff staff1 = new Staff("Adzoa", 40, "Female", "Caterer");

        ArrayList<Student> allStudents = new ArrayList<>();
        
        allStudents.add(student1);

        // todo make an arralist to contain all the objects
        // todo make a function that shows all the objects of a particular class

        // public void show()

        for(Student student : allStudents) {
            System.out.println(student);
        }

    }
    
}
