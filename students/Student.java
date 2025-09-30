public class Student {
        public String name;
        private int age;
        public int year;


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

         public Student(String name, int age, int year) {
             this.name = name;
             this.year = year;
             setAge(age);
         }

        public void details() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Year: " + this.getYear());

        
        }

    }