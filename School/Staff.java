package School;

public class Staff extends Occupant  {

    Staff(String name, int age, String sex, String occupation) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.occupation = occupation;
    };

    @Override
    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + sex + ", Occupation: " + occupation);
    }
    
}
