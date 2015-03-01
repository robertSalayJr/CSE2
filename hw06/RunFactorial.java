/////////////////////
//Robert Salay
//hw 06 - Run Factorial
//2/28/2015
// Collect 1 integer [9-16] and determine its factorial
import java.util.Scanner;
public class RunFactorial{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        int factorial = 1; int factor=0; int i = 0; int maxFactor = 0; int flag = 0;
        String garbage = " ";
        System.out.println("Please enter an integer between 9 and 16.");
        do{
            flag = 0;
            if(i == 0 && factor == 0 && myScanner.hasNextInt()){ //if input is legal & factor hasn't been chosen before
                factor = myScanner.nextInt();
            } else if (i == 0){ //if input is not int & factor is unchosen
                factor = 0;
                garbage = myScanner.next(); //remove unusable data
                System.out.println("Invalid input, enter again!");
                flag = 1; //keeps invalid input from displaying twice
            }
            if(i == 0 && factor >= 9 && factor <= 16){ //if a factor is satisfactory & hasn't already been chosen before
                i =1;
                maxFactor = factor;
            }else if (i == 0 && flag == 0){ //if factor is >16 | <9 & input is int
                garbage = " ";
                factor = 0;
                System.out.println("Invalid input, enter again!");
            }
            if (i == 1 && factor != 0){
                factorial *= factor;
                factor--;
            }
        }while(factor != 0 || i != 1);
        System.out.println(maxFactor + "!= " + factorial);
    }
}