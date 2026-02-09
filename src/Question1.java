public class Question1 {
    public static void main(String [] args){
        double [] prices = {15.0, 55.0, 120.0, 200.0};
        double totalBill = 0.0;

        // 0, 1, 2, 3, 4

        for (int i = 0; i <= (prices.length -1); i ++) {
            boolean isDiscounted = false;
            double currentPrice = prices[i];

            if (currentPrice > 100) {
                double discount = 0.2 * currentPrice; // 24
                currentPrice = currentPrice - discount;
                isDiscounted = true;
                totalBill += currentPrice;

            }
            else{
                totalBill += currentPrice;
            }
            System.out.println((i + 1) + ". " + currentPrice);
            if (isDiscounted){
                System.out.println("20% Discount Applied!");

            }


        }
        System.out.println("The total bill is: " + totalBill);




    }
}
