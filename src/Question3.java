import java.util.Scanner;
public class Question3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double oxygenTank = 500.0;
        int diverCount = 0;
        while(oxygenTank > 50){
            System.out.print("Enter the amount of oxygen needed for the dive: ");
            double oxygenNeeded = scanner.nextDouble();
            if (oxygenNeeded > oxygenTank){
                System.out.println("Insufficient oxygen for this dive!");
                break; // continue
            }
            else {
                oxygenTank -= oxygenNeeded;
                diverCount += 1;
                System.out.println("Dive Successful!");

            }
            if (oxygenTank < 150){
                System.out.println("WARNING: Oxygen level at " + oxygenTank + " - Return to surface soon.");
            }

        }
        System.out.println("Total Dives: " + diverCount);
        System.out.println("Remaining Oxygen: " + oxygenTank);
        scanner.close();


    }

}
