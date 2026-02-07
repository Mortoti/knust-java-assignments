public class Question2 {
    public static void main(String [] args){
        int [] stockLevels = {9,45,8,100,3,25};
        int reorderCount = 0;
        int totalStock = 0;

        for (int i = 0; i <=5; i ++){
            int currentStock = stockLevels[i];
            if (currentStock < 10){
                System.out.println("Item " + (i + 1) + ": " +currentStock + " units");
                System.out.println("CRITICAL: Reorder Immediately");
                reorderCount += 1;
                totalStock += currentStock;

            }
            else if (currentStock >= 10){
                System.out.println("Item " + (i + 1) + ": " + currentStock + " units - Stable");
                totalStock += currentStock;

            }

        }
        System.out.println("The total number of items in the warehouse is: " + totalStock);
        System.out.println("The total number of items we need to reorder is: " + reorderCount);

    }
}
