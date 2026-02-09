import java.util.Scanner;
public class Question5 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int attempts = 0;

        int maxAttempts = 3;
        do {
            attempts += 1;
            System.out.print("Enter the temperature: ");
            double temp = scanner.nextDouble();
            if (temp >= 20 && temp <= 40){
                break;
            }
            else{
                System.out.println("Invalid Temperature! Attempt " + attempts + " of 3 used");

            }


        } while (attempts < maxAttempts);

        if (attempts == 3){
            System.out.println("You failed!");
        }
        else {
            System.out.println("Valid Temperature. You got it");
        }

        scanner.close();

    }
}
