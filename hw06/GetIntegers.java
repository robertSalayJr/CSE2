/////////////////////
//Robert Salay
//hw 06 - Get Integers
//2/28/2015
// Collect 5 integers from user and add them together
import java.util.Scanner;

public class GetIntegers{
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        int total = 0, nextOne = 0;
        String garbage = " ";
        
        System.out.println("Please enter 5 non-negative integers.");
        for(int i = 1; i < 6; i++){
            if(myScanner.hasNextInt()){
                nextOne=myScanner.nextInt(); //accepts user input if a number
            }else{
                nextOne=0; //keeps total the same for invalid answers
                garbage = myScanner.next(); //removes unusable input
                System.out.println("Invalid input, enter again."); 
                i--; //lengthens the loop
            }
            if(nextOne < 0){
                nextOne =0; //keeps total the same
                System.out.println("Invalid input, enter again.");
                i --; //lengthens the loop
            }
                total+=nextOne; //adds all positive #s together
        }
        System.out.println("Sum is " + total);
    }
}