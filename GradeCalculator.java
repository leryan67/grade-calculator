import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        String letterGrade = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a grade: ");
        double grade = input.nextDouble();

        System.out.println("You entered: " + grade);

        if (grade >= 90 && grade <= 100) {
            letterGrade = "A";
        }
        else if (grade >= 80 && grade < 90) {
            letterGrade = "B";
        }
        else if (grade >= 70 && grade < 80) {
            letterGrade = "C";
        }
        else if (grade >= 60 && grade < 70) {
            letterGrade = "D";
        }
        else if (grade >= 50 && grade < 60) {
            letterGrade = "F";
        }
        else {
            letterGrade = "\"You suck bro.\"";
        }
        
        input.close();
    }
}
