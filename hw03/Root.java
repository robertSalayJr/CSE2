/////////////////
//Robert Salay
// Homework 03
//2/8/2015
//Estimate the cube root of an inputted #, then show that guess cubed.
import java.util.Scanner; //import scanner
public class Root{
    public static void main(String[] args){
        //create variables
        Scanner myScanner = new Scanner(System.in);
        double input, guess, guessCubed;
        System.out.print("Enter a double, and I will print its cube root: ");
        input = myScanner.nextDouble();
        
        guess = input/3; //calculate and refine guess
        guess = (2*guess*guess*guess+input)/(3*guess*guess);
        guess = (2*guess*guess*guess+input)/(3*guess*guess);
        guess = (2*guess*guess*guess+input)/(3*guess*guess);
        guess = (2*guess*guess*guess+input)/(3*guess*guess);
        guess = (2*guess*guess*guess+input)/(3*guess*guess);
        
        guessCubed = Math.pow(guess, 3); //cube guess
        
        //print data
        System.out.println("The cube root is " + guess);
        System.out.println(guess+"*"+guess+"*"+guess+"=\n"+guessCubed);
    }
}