import java.util.Scanner;
public class Question4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double weightLimit = 1000.0;
        double currentWeight = 0.0;
        int packageCount = 0;
        while (currentWeight < weightLimit){
            System.out.print("Please enter the weight of the package: ");
            double weight = scanner.nextDouble();
            if (weight == -1){
                System.out.println("Ending........");
                break;
            }
            else if (weight > (weightLimit-currentWeight)){
                System.out.println("Package too heavy");
            }
            else if (weight <= (weightLimit-currentWeight)){
                currentWeight += weight;
                packageCount += 1;
                System.out.println("Package Added");
            }
            else if (currentWeight == weightLimit){
                System.out.println("TRUCK AT MAXIMUM CAPACITY");
                break;
            }
        }
        System.out.println("We loaded a total of " + packageCount + " packages");
        System.out.println("The final weight is " + currentWeight);
        scanner.close();
    }
}
