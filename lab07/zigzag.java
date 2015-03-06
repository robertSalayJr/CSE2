/////////////////////
//Robert Salay
//lab 07 - zigzag
//3/6/15
// output patterns of * using loops
import java.util.Scanner;
public class zigzag{
    public static void main(String[]args){
        //project 3: make a backwards z formation of * using a user generated variable
        Scanner myScanner = new Scanner(System.in);
        int hold2 = 1;
        while(hold2 == 1){
            int hold = 1; int nStars = 0; int count1 = 0; int count2 = 0;
        System.out.print("Enter an int between 3 & 33: "); //prompt user
        while (hold == 1){
            if (myScanner.hasNextInt()){
                nStars = myScanner.nextInt();
            } else{
                String garbage = myScanner.next(); //removes user input if invalid
            }
            if (nStars >= 3 && nStars <= 33){
                hold = 0; //ends loop if user input is valid
            } else{
                System.out.print("Invalid input, please enter again: ");
            }
        }
        while(count1<nStars){
            if(count1 == 0 || count1 == nStars - 1){
                count2 = 0; //resets count2 with each outer loop
                while(count2<nStars){   //creates a line of * as long as user input
                    System.out.print("*"); //on first and last lines of output
                    count2++;
                }
                if(count1 == nStars - 1){
                    break;
                }
                count1 = 1; // takes diagonal section directly to the second line
                System.out.print("\n"); //moves printing to second line of backwards z
                while(count1<nStars - 1){
                    for(int i = 1; i <= count1; i++){
                        System.out.print(" "); //prints one less space than line #
                    }
                    System.out.println("*"); //prints * and ends line
                    count1++;
                }
            }
        }
        System.out.print("\n"); //separate the z from the next line
        System.out.print("Enter y or Y to go again: ");
        String userInput = myScanner.next();
        if (!userInput.equals("y")&& !userInput.equals("Y") ){ //loop continues only if user types y or Y
            hold2 = 0;
        }
        }
    }
}