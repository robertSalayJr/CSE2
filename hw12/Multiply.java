//////////
//Robert Salay
//HW12-Matrix Multiplication
//4/19/2015
// Determine if two matrices can be multiplied, and do so if possible.

import java.util.Random;
import java.util.Scanner;

public class Multiply{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        boolean flag = true;
        int[] arrayArray = new int[4]; //array holds height/width data of other arrays
        do{
            for(int i = 0; i < 4; i++){
                switch(i){ //prints message about which integer is desired as the need changes
                    case 0:
                        System.out.print("Please print the width of the 1st matrix: ");
                        break;
                    case 1:
                        System.out.print("Please print the height of the 1st matrix: ");
                        break;
                    case 2:
                        System.out.print("Please print the width of the 2nd matrix: ");
                        break;
                    case 3:
                        System.out.print("Please print the height of the 2nd matrix: ");
                        break;
                }
                if(myScanner.hasNextInt()){
                    int temp = myScanner.nextInt();
                    if(temp <= 0){
                        System.out.println("That is not a valid number");
                        i--; //keeps loop on the same iteration until input is correct
                    } else {
                        arrayArray[i] = temp;
                    }
                } else {
                    System.out.println("You did not enter an integer.");
                    i--;
                    String garbage = myScanner.next(); //removes unusable input
                }
            }
            
            if(arrayArray[1] != arrayArray[2]){
                System.out.println("These matrices cannot be multiplied! Try again.");
                flag = true; //keeps the loop going if the matrices can't be used
            } else {
                flag = false;
            }
        } while(flag);
        
        int[][] firstArray = new int[arrayArray[0]][arrayArray[1]];
        int[][] scndArray = new int[arrayArray[2]][arrayArray[3]];
        
        firstArray = randomMatrix(arrayArray[0], arrayArray[1]);
        scndArray = randomMatrix(arrayArray[2], arrayArray[3]);
        
        printMatrix(firstArray);
        System.out.println(" "); //separates 1st and second arrays
        printMatrix(scndArray);
        System.out.println(" "); //separates 2nd and final arrays
        
        int[][] multArray = new int [arrayArray[0]][arrayArray[3]];
        multArray = matrixMultiply(scndArray, firstArray);
        printMatrix(multArray);
    }
    
    public static int[][] randomMatrix(int width, int height){
        Random randomGen = new Random();
        int[][] arra = new int[height][width];
        
        for(int i = 0; i < arra.length; i++){
            for(int j = 0; j < arra[i].length; j++){
                arra[i][j] = randomGen.nextInt(21) - 10; // random int -10 to 10
            }
        }
        
        return arra;
    }
    
    public static void printMatrix(int[][] array){
            for(int i = 0; i < array.length; i++){
                System.out.print("[ ");
                for(int j = 0; j < array[0].length; j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println("]");
            }
    }
    
    public static int[][] matrixMultiply(int[][] arraA, int[][] arraB){
        if (arraA[0].length != arraB.length){
            System.out.println("These arrays cannot be multiplied!");
            return null; //stops method if the arrays are incorrect
        }
        int[][] arraC = new int[arraA.length][arraB[0].length];
        
        for(int i = 0; i < arraA.length; i++){
            for(int j = 0; j < arraB[0].length; j++){
                for(int k = 0; k < arraB.length; k++){
                    arraC[i][j] += arraA[i][k] * arraB[k][j];
                }
            }
        }
        
        return arraC;
    }
}