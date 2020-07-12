import java.util.Scanner;

public class Homework {

        public static void main (String [] args) {
            System.out.println("What is your age?");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age > 65) {
                System.out.println("Your discount is 10%!");
            } else if (age < 18) {
                System.out.println("Your discount is 25%!");
            } else if (age < 65) {
                System.out.println("Give additional 5%!");
            } else if (age > 18) {
                System.out.println("Give additional 5%!");
            }
        }
}
