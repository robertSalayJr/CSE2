/////////////////////
//Robert Salay
//Lab 03
//2/6/15
//The price of Big Mac purchases in different states.
//
//import scanner class
import java.util.Scanner;

public class BigMac{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //initialize scanner to accept input
        int nBigMacs, dollars, dimes, pennies;
        double bigMac$, taxage, cost$;
        
        //collect variables from user
        System.out.print("Enter the number of Big Macs as an integer > 0: ");
        nBigMacs = myScanner.nextInt();
        System.out.print("Enter the price of each Big Mac as a double. (xx.xx): ");
        bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the tax percentage as a whole number: ");
        taxage = myScanner.nextDouble();
        taxage /= 100; //change percentage# from whole # to percentage
        
        //calculate cost using variables input by user
        cost$ = nBigMacs * bigMac$ * (1+taxage);
        //get dollars by dropping decimals
        dollars = (int)cost$;
        //get dimes & pennies
        dimes = (int)(cost$ * 10) % 10;
        pennies = (int)(cost$ * 100) % 10;
        
        //print out total cost.
        System.out.println("The total cost of " +nBigMacs+ " Big Macs, at $"
        +bigMac$+ " per burger, with a " + (int)(taxage * 100) + "% tax rate, is $"
        + dollars + "." + dimes + pennies);
    }
}