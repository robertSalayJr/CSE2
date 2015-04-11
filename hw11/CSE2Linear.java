////////////////////
//Robert Salay
//HW 11 - 
//4/11/2015
/*1. Create a 15 int array [0-100] in ascending order using user input
2. use a binary search to look for user-inputted int, and print the number of iterations it took.
3. scramble the array
4. use a linear search to find another user-input int, and show # of it.s again
*/
import java.util.Scanner;
import java.util.Random;

public class CSE2Linear{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int grades[] = new int[15];
        int counter = 0; int tempHold = 0; int key = 0; int iterCount;
        boolean flag = true;
        
        System.out.println("Enter 15 ints for final grades in CSE2:");
        
        while (counter < 15){
            while (flag){ //holds code until user enters a proper integer for the next portion of the loop
                if(myScanner.hasNextInt()){
                    tempHold = myScanner.nextInt();
                    flag = false;
                } else {
                    System.out.println("You didn't enter an integer.");
                    String garbage  = myScanner.next();
                }
            }
            flag = true; //resets flag for next iteration
            
            if(counter != 0){
                if(tempHold >= grades[(counter - 1)] && tempHold <= 100){
                    grades[counter] = tempHold;
                    counter++;
                } else{
                    System.out.print("The int you entered is out of bounds");
                    if(tempHold < grades[(counter - 1)]){
                        System.out.print(", and less than your previous answer");
                    }
                    System.out.println(".");
                }
            } else {
                if(tempHold >= 0 && tempHold <= 100){
                    grades[counter] = tempHold;
                    counter++;
                } else{
                    System.out.println("The int you entered is out of bounds.");
                }
            }
        }
        
        System.out.print("The grades, sorted, are: ");
        for(int i = 0; i < 15; i++){
                System.out.print(grades[i] + " ");
        }
        System.out.println("");
        System.out.print("Enter a grade to search for: ");
        
        while(flag){
            if(myScanner.hasNextInt()){
                key = myScanner.nextInt();
                flag = false;
            } else{
                System.out.print("That wasn't an int, try again: ");
                String garbage = myScanner.next();
            }
        }
        
        iterCount = binarySearch(grades, key, 0, 14, 1);
        
        if (iterCount == -1){
            System.out.println(key + " was not found in the list with 4 iterations."); //a binary search will always go through a 15 int array in 4 iterations, so no variable is needed
        } else {
            System.out.println(key + " was found in the list with " + iterCount + " iteration(s).");
        }
        
        for(int i = 0; i<15; i++){
            int rando = randomGenerator.nextInt(15); //creates a random int between 14 and 0
            tempHold = grades[i];
            grades[i] = grades[rando];
            grades[rando] = tempHold; //switches current grade value with a random one from elsewhere in the array
        }
        
        System.out.println("Scrambled:");
        
        for(int i = 0; i<15; i++){
            System.out.print(grades[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Enter a grade to search for: ");
        
        flag = true;
        while (flag){
            if (myScanner.hasNextInt()){
                key = myScanner.nextInt();
                flag = false;
            } else {
                System.out.println("That wasn't an integer, try again please.");
                String garbage = myScanner.next();
            }
        }
        
        iterCount = -1; //resetting iterCount for another search
        for(int i = 0; i<15; i++){
            if(grades[i] == key){
                iterCount = i + 1; //the # of iterations starts at 1, and grows with i
            }
        }
        
        if(iterCount == -1){
            System.out.println(key + "wasn't found in the list with 15 iterations.");
        } else {
            System.out.println(key + " was found in the list with " + iterCount + " iterations.");
        }
    }
    
    public static int binarySearch(int[] arra, int wanted, int min, int max, int count){
        if(min > max){
            return -1; //returns an impossible count # to show the key wasn't found.
        }
        int midd = (int) ((min + max) / 2); //created int average between the max value and min value
        
        if (arra[midd] < wanted){
            return binarySearch(arra, wanted, (midd + 1), max, (count + 1) );
        } else if (arra[midd] > wanted){
            return binarySearch(arra, wanted, min, (midd - 1), (count + 1) );
        } else {
            return count;
        }
        
    }
}