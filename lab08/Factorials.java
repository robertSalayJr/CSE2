/////////////////////////////
//Robert Salay
//lab 08 - Factorials
//3/20/15
//find the super factorial of a user inputted int
//use 3 methods: main, factorial, and print
import java.util.Scanner;

public class Factorials{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        int entry = 0; int sum = 0;
        System.out.print("Please enter an integer: ");
        entry = myScanner.nextInt(); // allows user to enter an integer
        
        for (int i = 1; i <= entry; i++){ //creates a factorial for every int 1 to entry
            sum += factorial(i);
        }
        
        print(entry, sum);
    }
    
    public static int factorial(int base){
        int current = 1;
        
        for (int i = 1; i <= base; i++){
            current *= i;
        }
        
        System.out.println(current);
        
        return current;
    }
    
    public static void print(int start, int total){
        System.out.println("The super factorial of " + start + " is equal to " + total);
    }
}