import java.util.Scanner;
public class Question3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double oxygenTank = 500.00;
        int diverCount = 0;
        while (oxygenTank > 50.00){
            System.out.print("Enter the oxygen needed for this dive in Liters: ");
            double oxygenNeeded = scanner.nextDouble();
            if (oxygenNeeded > oxygenTank){
                System.out.println("Insufficient oxygen for this dive!");
                break;
            }
            else{
                oxygenTank -= oxygenNeeded;
                diverCount += 1;
                System.out.println("Dive Successful");
            }
            if (oxygenTank < 150){
                System.out.println("WARNING: Oxygen level at " + oxygenTank);
                System.out.println("Return to surface soon");
            }
        }
        System.out.println("Total Successful Dives: " + diverCount);
        System.out.println("Remaining Oxygen: " + oxygenTank + " Liters");
        scanner.close();

    }

}
