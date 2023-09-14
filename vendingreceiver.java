import java.util.Scanner;

/**
    simple coin-receiver for a soda vending machine.
    @author becca jellinek
    @author tiffany atkinson
*/
public class vendingreceiver {
    /**
     * @param letter that the user entered
     * @return value of letter in cents
     */
    public static int getBalance(String letter) {
        switch (letter) {
            case "P":
            case "p":
                return 1;
            case "N":
            case "n":
                return 5;
            case "D":
            case "d":
                return 10;
            case "Q":
            case "q":
                return 25;
            case "H":
            case "h":
                return 50;
            case "G":
            case "g":
                return 100;
            default:
                System.out.println("I don't recognize this letter.");
                return -1;
        }
    }

    /**
     * Main entry to the program
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Please enter a coin: ");

        Scanner in = new Scanner(System.in); 

        double balance = (double) getBalance(in.nextLine());
        
        System.out.printf("Your balance is: %.2f", balance);   
    }
}