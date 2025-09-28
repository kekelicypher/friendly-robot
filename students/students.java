public class students{
    
    public class Student {
        private String name;
        private int age;
        private int year;


        public int getYear() {
            return this.year;
        }

        public void setAge(int age) {
            if (age > 0 && age < 30) {
                this.age = age;
            }

            else {
                System.out.println("Invalid age");
            }
        }

    }

    // public Student(String name, int age, int year) {
    //     this.name = name;
    //     this.age = setAge(age);
    //     this.year = year;
    // }



    public static void main(String[] args) {

    }
}