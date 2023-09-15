/**
 * Given number in cents, return proper change
 * @author @beccajellinek
 * @author @tiffanyatkinson
 */
public class vendingcents {
    public static void main(String[] args) {
        String arg = args[0];
        int amount = Integer.parseInt(arg);

        // number of golden dollar coins
        int golden = amount / 100;
        amount = amount % 100;

        // number of half dollar coins
        int half = amount / 50;
        amount = amount % 50;

        // number of quarters
        int quarter = amount / 25;
        amount = amount % 25;

        int dime = amount / 10;
        amount = amount % 10;

    
        int nickel = amount / 5;

        int penny = amount % 5;


        String formatString = "%d golden dollar coins, %d half dollar coins, %d quarters, %d dimes, %d nickels, %d pennies\n";
        System.out.printf(formatString, golden, half, quarter, dime, nickel, penny);
        
    }

}