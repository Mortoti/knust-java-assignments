import java.util.Scanner;
public class Question4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double weightLimit = 1000.0;
        double currentWeight = 0.0;
        int packageCount = 0;
        while (currentWeight < weightLimit){
            System.out.print("Enter the weight of the package: ");
            double weight = scanner.nextDouble();
            if (weight == -1){
                System.out.println("Ending...");
                break;
            }
            else if ((currentWeight + weight) > weightLimit){
                System.out.println("Package too heavy! Truck only has " + (weightLimit -currentWeight) + " kg of space left.");

            }
            else{
                currentWeight += weight;
                packageCount += 1;
                System.out.println("Load added!");
                if (currentWeight == weightLimit){
                    System.out.println("TRUCK AT MAXIMUM CAPACITY");
                }

            }

        }
        System.out.println("Total Packages: " + packageCount);
        System.out.println("Total Weight: " + currentWeight);
        scanner.close();

    }
}
