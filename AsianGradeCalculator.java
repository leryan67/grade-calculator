import java.util.Scanner;
public class AsianGradeCalculator {
    public static void main(String[] args) {
        String letterGrade = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a grade: ");
        double grade = input.nextDouble();

        System.out.println("You entered: " + grade);

        if (grade > 100) {
            letterGrade = "G for Genius";
        }
        else if (grade >= 90 && grade <= 100) {
            letterGrade = "A for Average";
        }
        else if (grade >= 80 && grade < 90) {
            letterGrade = "B for Below Average";
        }
        else if (grade >= 70 && grade < 80) {
            letterGrade = "C for Chop Your Hand Off";
        }
        else if (grade >= 60 && grade < 70) {
            letterGrade = "D for Die";
        }
        else if (grade >= 50 && grade < 60) {
            letterGrade = "F for Face Hell";
        }
        else {
            letterGrade = "S for Stop Existing";
        }

        System.out.println("Your grade is: " + letterGrade);

        input.close();
    }
}
