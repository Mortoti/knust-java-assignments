public class Question1 {
    public static void main(String [] args){
    double [] prices = {15.0, 55.0, 120.0, 200.0};
    double totalBill = 0.0;
    boolean isDiscounted = false;
    double discount =  0.0;

    for (int i = 0; i <=3; i ++){
        double currentPrice = 0.0;
        currentPrice = prices [i];

        if (currentPrice >=100){
            discount = 0.2 * currentPrice;
            currentPrice =currentPrice - discount ;
            isDiscounted = true;
        }
        totalBill += currentPrice;
        System.out.println(i + 1 + ". " + currentPrice);
        if (isDiscounted){
            System.out.println("20 % Discount Applied!");
        }

    }

        System.out.println("The total bill is: " + totalBill);


    }
}
