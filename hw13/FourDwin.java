//////////////////
//Robert Salay
// HW 13 - 4D array
// 4/28/2015
// Create a jagged 4D array [3][x-y][x-y][x-y], give all values doubles from 0.0-30.0
// Sort arrays, then print # of spaces, sum, and average value.

import java.util.Scanner;
import java.util.Random;

public class FourDwin{
    public static void main (String[]args){
        
        Scanner myScan = new Scanner(System.in);
        Random randomGen = new Random();
        int x = 0; 
        int y = 0; 
        int userInput;
        boolean flag = true;
        double[][][][] uberArray = new double[3][][][];  //first dimension is 3, all others will be decided later
        
        System.out.print("Enter an integer X: ");
        
        while(flag == true){
            if(myScan.hasNextInt()){
                userInput = myScan.nextInt();
                if(userInput > 0){
                    x = userInput;
                    flag = false; //loop only terminates when proper input is found
                } else {
                    System.out.print("Invalid input. Please enter an integer for X: ");
                }
            } else {
                System.out.print("Invalid input. Please enter an integer for X: ");
                String garbage = myScan.next();
            }
        }
        
        flag = true;
        System.out.print("Enter an integer Y where Y > X: ");
        while(flag == true){
            if(myScan.hasNextInt()){
                userInput = myScan.nextInt();
                if(userInput > x){
                    y = userInput;
                    flag = false; //loop only terminates when proper input is found
                } else {
                    System.out.print("Invalid input. Please enter an integer for Y>X: ");
                }
            } else {
                System.out.print("Invalid input. Please enter an integer for Y>X: ");
                String garbage = myScan.next();
            }
        }
        
        for(int i = 0; i < uberArray.length; i++){ //randomly determines length for each value of 1st array from x to y
            int secondDim = (int)(x + randomGen.nextInt(y - x + 1));
            uberArray[i] = new double[secondDim][][];
        }
        
        for(int i = 0; i < uberArray.length; i++){ //randomly determines length for each value of 2nd array from x to y
            for(int j = 0; j < uberArray[i].length; j++){
                int thirdDim = (int)(x + randomGen.nextInt(y - x + 1));
                uberArray[i][j] = new double[thirdDim][];
            }
        }
        
        for(int i = 0; i < uberArray.length; i++){ //randomly determines length for each value of 3rd array from x to y
            for(int j = 0; j < uberArray[i].length; j++){
                for(int k = 0; k < uberArray[i][j].length; k++){
                    int fourthDim = (int)(x + randomGen.nextInt(y - x + 1));
                    uberArray[i][j][k] = new double[fourthDim];
                }
            }
        }
        
        for(int i = 0; i < uberArray.length; i++){ //randomly determines value of all members of uberArray from 0.0 - 30.0
            for(int j = 0; j < uberArray[i].length; j++){
                for(int k = 0; k < uberArray[i][j].length; k++){
                    for(int l = 0; l < uberArray[i][j][k].length; l++){
                        double longDoub = 30 * randomGen.nextDouble();
                        uberArray[i][j][k][l] = doubCut(longDoub);
                    }
                }
            }
        }
        
                    
        System.out.println(" ");
        System.out.println("Original Array:");
        
        printFourDArray(uberArray);
        
        uberArray = sortFourDArray(uberArray);
        
        for(int i = 0; i < uberArray.length; i++){
            uberArray[i] = sortThreeDArray(uberArray[i]);
        }
        
        System.out.println("\n\nSorted Array:\n");
        
        printFourDArray(uberArray);
        
        System.out.println("\nStats:\n");
        
        statArray(uberArray);
        
    }
    
    public static void statArray(double[][][][] list){
        int members = 0;
        double sum = 0.0;
        double mean = 0.0;
        
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
                for(int k = 0; k < list[i][j].length; k++){
                    for(int l = 0; l < list[i][j][k].length; l++){
                        members++; //adds 1 to total length of uberArray
                        sum += list[i][j][k][l]; //adds value to total value of uberArray
                    }
                }
            }
        }
        mean = sum / members;
        
        System.out.println("Members: \t" + members);
        System.out.println("Sum: \t\t" + doubCut(sum)); //shortens sum & mean to one decimal
        System.out.println("Mean: \t\t" + doubCut(mean));
    }
    
    public static double[][][] sortThreeDArray(double[][][] arr){
        int arrayFlag = 0;
        int minArrayLength = 999;
        double minOfAllArrays = 9999.9;
        double min = 9999.9;
        
        for(int i = 0; i < arr.length; i ++){
            minArrayLength = 99999;
            min = 9999.9;
            
            for(int z = i; z < arr.length; z++){
                for(int j = 0; j < arr[z].length; j++){
                    for(int k = 0; k < arr[z][j].length; k++){
                        if(arr[z][j][k] < min){
                            min = arr[z][j][k]; //keeps track of minimum value in current array
                        }
                    }
                }
                if(arr[z].length < minArrayLength){
                    arrayFlag = z;
                    minArrayLength = arr[z].length;
                    minOfAllArrays = min;
                } else if(arr[z].length == minArrayLength){ //if minimum of current array is less than the min of an array of equal size, current array gets sorted first
                    if(min < minOfAllArrays){
                        arrayFlag = z;
                    }
                }
            }
            double[][] temp = arr[arrayFlag]; //switching z with shortest array
            arr[arrayFlag] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    
    public static double[][][][] sortFourDArray(double[][][][] arra){
        int arrayFlag = 0;
        int minArrayLength = 999;
        double minOfAllArrays = 9999.9;
        double min = 9999.9;
        
        for(int i = 0; i < arra.length; i++){
                minArrayLength = 99999;
                min = 9999.9;

                for(int z = i; z < arra.length; z++){
                    for(int j = 0; j < arra[z].length; j++){
                        for(int k = 0; k < arra[z][j].length; k++){
                            for(int l = 0; l < arra[z][j][k].length; l++){
                                if(arra[z][j][k][l] < min){
                                    min = arra[z][j][k][l];
                                }
                            }
                        }
                    }
                if(arra[z].length < minArrayLength){
                    arrayFlag = z;
                    minArrayLength = arra[z].length;
                    minOfAllArrays = min;
                } else if(arra[z].length == minArrayLength){
                    if(min < minOfAllArrays){
                        arrayFlag = z;
                    }
                }
            }
            double[][][] temp = arra[arrayFlag];
            arra[arrayFlag] = arra[i];
            arra[i] = temp;
        }
        return arra;
    }
    
    public static void printFourDArray(double[][][][] arra){ //prints array in nested format
        System.out.println("{");
        for(int i = 0; i < arra.length; i++){
            System.out.println("\t{");
            for(int j = 0; j < arra[i].length; j++){
                System.out.println("\t\t{");
                for(int k = 0; k < arra[i][j].length; k++){
                    System.out.print("\t\t\t{");
                    for(int l = 0; l < arra[i][j][k].length; l++){
                        System.out.print(arra[i][j][k][l] + ", ");
                    }
                    System.out.println("}, ");
                }
                System.out.println("\t\t}, ");
            }
            System.out.println("\t},");
        }
        System.out.println("}");
    }
    
    public static double doubCut(double starter){ //cuts any double to only one decimal
        int cutter = (int) (starter*10);
        return (double) cutter / 10;
    }
}