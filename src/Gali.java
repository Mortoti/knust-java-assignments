public class Gali {
    public static void main(String [] args){
        double [] prices = {15.0, 55.0, 120.0, 200.0};
        double totalBill = 0.0;

        // 0 , 1, 2, 3
        for (int i = 0; i <prices.length; i++){
            double currentPrice = prices[i];
            if (currentPrice > 100){
                double discount = 0.2 * currentPrice;
                currentPrice = currentPrice -discount;
                totalBill += currentPrice;
                System.out.println("20% Discount Applied!");
            }
            else{
                totalBill += currentPrice;
            }
            System.out.println("Item " + (i+1) + ". " + currentPrice);


        }
        System.out.println("Total Bill: " + totalBill);





    }
}
