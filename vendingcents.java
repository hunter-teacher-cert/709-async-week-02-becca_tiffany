import java.util.Scanner;

public vendingcents {
    public final int GOLDEN_DOLLAR = 100;
    public final int HALF_DOLLAR = 50;
    public final int QUARTER = 25;
    public final int DIME = 10;
    public final int NICKEL = 5;
    public final int PENNY = 1;

    // public static void calculate(int balance) {
    //     int numGoldenDollars;
    //     int numHalfDollars;
    //     int numQuarters;
    //     int numDimes;
    //     int numNickels;
    //     int numPennies;

    //     if (balance >= GOLDEN_DOLLAR) {
    //         numGoldenDollars = balance / GOLDEN_DOLLAR;
    //         // this is an example of recursion
    //         calculate(balance % GOLDEN_DOLLAR);
    //      } else if (balance >= HALF_DOLLAR) {
 
    //      } else if (balance >= QUARTER) {
 
    //      } else if (balance >= DIME) {
 
    //      } else if (balance >=NICKEL) {
             
    //      } else if (balance >= PENNY ) {
 
    //      } else {
    //          System.out.println("Something went wrong");
    //      }

    //     //  return 
    // }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int balance = in.nextInt();
         
       
    }

}


/**
 * [vendingcents.java] Vending machine change maker. On the command line accept an
integer representing the number of cents currently inside of a vending machine. (For
example: java vendingcents 35, would mean that there are $0.35 inside the machine.)

Return all of the money to the user using the largest possible change. (For example,
with $0.65, we do not return 65 pennies, we return 2 quarters and a dime and a nickel.)

java vendingcents 65
"2 quarters, 1 dime, 1 nickel"


The denominations you are using are golden dollar coin ($1.00 or 100 cents), half dollar
coin ($0.50), quarter ($0.25), dime ($0.10), nickel ($0.05), and penny ($0.01). HINT:
Modulus.
 * 
 */