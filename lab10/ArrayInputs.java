////////////////////
//Robert Salay
//Lab 10 - Array Inputs
//4/3/2015
// Create array w/ size from user input, and fill it with numbers from user
import java.util.Scanner;
public class ArrayInputs{
    public static void main (String [] args){
        int arraySize; int counter = 0; int input = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter an integer for the size of an array: ");
        arraySize = myScanner.nextInt();
        int[] userInput;   // creates array
        userInput = new int[arraySize]; //sets up size of array
        
        while (counter < arraySize){
            System.out.print("Please enter a positive integer: ");
            if(myScanner.hasNextInt()){
                input = myScanner.nextInt();
            } else {
                System.out.println("Sorry, you didn't enter an integer.");
                input = 0;
                String garbage = myScanner.next(); //removes non-int input.
            }
            
            if(input > 0){
                userInput[counter] = input; //enters user input into array
                counter ++;  //moves to next array space
            } else if (input < 0){
                System.out.println("Sorry, the number you entered is negative.");
            }
        }
        
        System.out.println("The array is:");
        for(int i = 0; i < arraySize; i++){
            System.out.println(userInput[i]);  //prints ever value of userInput in order
        }
    }
}