import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {

        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a day of the week: ");
        String respond = scanner.nextLine().toUpperCase();
        
        Day day = Day.valueOf(respond);

        try {
            switch(day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("It is Monday");
                case FRIDAY -> System.out.println("It is Friday");
    
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid.");
        }


        scanner.close();














        System.out.println("Hello, World!");
    }
}
