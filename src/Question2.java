public class Question2 {
    public static void main(String [] args){
        int [] stockLevels = {12, 45, 8, 100, 3, 25};
        int reorderCount = 0;
        int totalStock = 0;


        for (int i = 0; i < stockLevels.length; i ++){
            int currentStock = stockLevels[i];
            if (currentStock < 10){
                System.out.println("Item "+ (i+1) + ": " + currentStock + " units - CRITICAL: Reorder\n" +
                        "immediately!");
                reorderCount += 1;
                totalStock += currentStock;
            }
            else{
                System.out.println("Item " + (i + 1) + ": " + currentStock + " units - Stable");
                totalStock += currentStock;
            }


        }
        System.out.println("Total Items: " + totalStock);
        System.out.println("Reorder Items: " + reorderCount);

    }
}
