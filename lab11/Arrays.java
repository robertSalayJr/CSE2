////////////////////
//Robert Salay
//Lab 11 - Arrays
//4/5/2015
// Create two randomized int arrays[50], search array1 linearly for max & min, and array2
//binarily for a user chosen int

import java.util.Scanner;
public class Arrays{
    public static void main (String[]args){
        
        int array1[] = new int[50];
            int array2[] = new int[50];
            int j = 0; //temporary storage for array2's previous value
            Scanner myScanner = new Scanner(System.in);
            int input; 
            int inputFound = 0;
            
        do{
            j = 0;
            for(int i = 0; i < 50; i++){
                array1[i] = (int) (Math.random()*101);
                array2[i] = (int) (Math.random()*101) + j;
                j = array2[i];
            }
        
            //linear search for max & min in array1
            int max = 0;
            int min = 101;
        
            for(int i = 0; i < 50; i++){
                if (array1[i] < min){
                    min = array1[i];
                }
                if (array1[i] > max){
                    max = array1[i];
                }
            }
        
            System.out.println("The maximum of array1 is: " + max);
            System.out.println("The minimum of array1 is: " + min);
            System.out.println("The maximum of array2 is: " + array2[49]);
            System.out.println("The minimum of array2 is: " + array2[0]);
            System.out.print("Enter an int: ");
            
            if (myScanner.hasNextInt()){
                input = myScanner.nextInt();
            } else {
                input = 0;
                System.out.println("You did not enter an int");
                System.exit(0);
            }
            
            if (input > 0){
                inputFound = BinarySearch(array2, input, 0, 49);
                if (inputFound == 50){
                    
                }
            } else {
                System.out.println("You did not enter an int > 0");
                System.exit(0);
            }
            
            if (array2[inputFound] == input){
                System.out.println(input + " was found in the list.");
            } else {
                System.out.println(input + " was not found in the list.");
                if(inputFound < 49){
                    System.out.println("The number above the key was " + array2[inputFound]);
                } else {
                    System.out.println("The key was larger than any number in the array"); //prevents OoB exception if input is larger than array2[49]
                }
                if(inputFound > 0){
                    System.out.println("The number below the key was " + array2[inputFound - 1]);
                } else {
                    System.out.println("The key was smaller than any number in the array"); //prevents OoB exception if input is smaller than array2[0]
                }
            }
        } while (input > 0);
    }
    
    public static int BinarySearch(int[] arra, int wanted, int mini, int maxi){
        if (maxi < mini){
            return mini;
        } else {
            int midd = (int) ((maxi + mini) / 2);
            
            if (arra[midd] > wanted){
                return BinarySearch(arra, wanted, mini, (midd - 1));
            } else if (arra[midd] < wanted){
                return BinarySearch(arra, wanted, (midd + 1), maxi);
            } else {
                return midd;
            }
        }
    }
}