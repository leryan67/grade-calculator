import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a grade: ");
        double grade = input.nextDouble();

        System.out.println("You entered: " + grade);

        input.close();
    }
}
