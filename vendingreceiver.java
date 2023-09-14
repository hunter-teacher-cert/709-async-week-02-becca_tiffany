import java.util.Scanner;

/**
    simple coin-receiver for a soda vending machine.
    @author becca jellinek
    @author tiffany atkinson
*/
public class vendingreceiver {
    /**
     * Main entry to the program
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Variable holds numeric value of user input
         */
        int balance;
        System.out.println("Please enter a coin: ");
        Scanner in = new Scanner(System.in); 
        /**
         * Variable holds user input 
         */
        String coin = in.nextLine();
        
        switch (coin) {
            case "P":
            case "p":
                balance = 1;
                break;
            case "N":
            case "n":
                balance = 5;
                break;
            case "D":
            case "d":
                balance = 10;
                break;
            case "Q":
            case "q":
                balance = 25;
                break;
            case "H":
            case "h":
                balance = 50;
                break;
            case "G":
            case "g":
                balance = 100;
                break;
            default:
                System.out.println("I don\"t recognize this letter.");
                break;
        }
        System.out.printf("Your balance is: %.2f", balance);   
    }
}