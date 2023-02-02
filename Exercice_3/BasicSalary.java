import java.util.Scanner;

/**
 * BasicSalary
 */
public class BasicSalary {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double salary = 0;

            System.out.println("Enter our basic salary");

            int basicSalary = scanner.nextInt();

            if (basicSalary < 0) {

                System.out.println("Our salary is not valid ");

            } else if (basicSalary > 20000) {

                salary = ((basicSalary * 1) + (basicSalary * 0.3) + (basicSalary * 0.95));

                System.out.println("Our salary is : " + salary);

            } else if (basicSalary <= 20000) {

                salary = ((basicSalary * 1) + (basicSalary * 0.25) + (basicSalary * 0.90));

                System.out.println("Our salary is : " + salary);

            } else if (basicSalary <= 10000) {

                salary = ((basicSalary * 1) + (basicSalary * 0.2) + (basicSalary * 0.8));

                System.out.println("Our salary is : " + salary);

            }

        }

    }
}