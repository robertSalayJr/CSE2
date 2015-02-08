////////////////////////
//Robert Salay
//Homework 03
//2/8/2015
//Print the first 4 digits to the right of a double's decimal point.
import java.util.Scanner;

public class FourDigits{
    public static void main(String[] args){
        //initialize variables
        double input;
        int frst, scnd, thrd, frth;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a double and I will display" +
        " the four digits to the right of the decimal point: ");
        input = myScanner.nextDouble();
        
        //turn the first 4 digits past the decimal point into integers
        frst = (int)(input * 10)%10;
        scnd = (int)(input * 100)%10;
        thrd = (int)(input * 1000)%10;
        frth = (int)(input * 10000)%10;
        
        //Print out 4 digits
        System.out.println("The four digits are " + frst + scnd + thrd + frth );
    }
}