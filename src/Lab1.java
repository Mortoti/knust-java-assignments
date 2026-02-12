import java.util.Scanner;
public class Lab1 {
    public static void main (String [] args) {

        Scanner scanner = new Scanner (System.in);
        // Grade Variables
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;

        // General Variables
        int numberOfStudents;
        int currentNumber = 1;
        char grade = 'F';
        double totalScore = 0;
        double minScore = 100.0;
        double maxScore = 0.0;


        // Main Code
        System.out.print("Please enter the number of students: ");
        numberOfStudents = scanner.nextInt();
        while(currentNumber <= numberOfStudents){

            // Score Input
            System.out.println("Enter the mid semester score for student " + currentNumber);
            double midSemScore = scanner.nextDouble();
            System.out.println("Enter the exams score for student " + currentNumber);
            double examScore = scanner.nextDouble();

            // Score Addition
            double score = ((examScore/100) *  70) + ((midSemScore/100)  * 30);
            totalScore += score;

            System.out.println("The score is: " + score);

            // Grading System
            if (score >= 70){
                grade = 'A';
                gradeA += 1;
                System.out.println("The final grade is: " + grade);
            }
            else if (score >= 60 ){
                grade = 'B';
                gradeB += 1;
                System.out.println("The final grade is: " + grade);
            }
            else if (score >= 50){
                grade = 'C';
                gradeC += 1;
                System.out.println("The final grade is: " + grade);
            }
            else if (score >= 40){
                grade = 'D';
                gradeD += 1;
                System.out.println("The final grade is: " + grade);
            }
            else{
                grade = 'F';
                gradeF += 1;
                System.out.println("The final grade is: " + grade);
            }
            currentNumber += 1;
            if (score > maxScore){
                maxScore = score;
            }
            if (score < minScore){
                minScore = score;
            }
        }

        if (numberOfStudents > 0){
            double average = totalScore / numberOfStudents;
            System.out.println("The average score is: " + average);
            System.out.println("Min Score: " + minScore);
            System.out.println("Max Score: " + maxScore);

            // Output
            System.out.println("Grade Analytics...");
            System.out.println("Grade A students: " + gradeA);
            System.out.println("Grade B students: " + gradeB);
            System.out.println("Grade C students: " + gradeC);
            System.out.println("Grade D students: " + gradeD);
            System.out.println("Grade F students: " + gradeF);

        }
        else{
            System.out.println("No data was entered");
        }

        scanner.close();
    }
}
