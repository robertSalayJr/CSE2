//////////////////
//Robert Salay
// Lb 13 - Jagged Arrays
// 4/24/2015
// Create a jagged array, sort, and then  alter their lengths so they are equal
import java.util.Random;

public class JaggedArrays{
    public static void main (String[]args){
        int[][] jaggArray = new int[5][];
        Random randomGen = new Random();
        for(int i = 0; i < jaggArray.length; i++){
            jaggArray[i] = new int[3*i + 5];
        }
        for(int i = 0; i < jaggArray.length; i++){
            for(int j = 0; j < jaggArray[i].length; j++){
                jaggArray[i][j] = randomGen.nextInt(40);
            }
        }
        printMatrix(jaggArray);
        System.out.println(" ");
        
        for(int i = 0; i < jaggArray.length; i++){
            jaggArray[i] = sortLine(jaggArray[i]);
        }
        printMatrix(jaggArray);
        System.out.println(" ");
        
        int max = 0;
        for(int i = 0; i < jaggArray.length; i++){
            if(jaggArray[i].length > max){
                max = jaggArray[i].length;
            }
        }
        
        for(int i = 0; i< jaggArray.length; i++){
            jaggArray[i] = resizeArray(jaggArray[i], max);
        }
        printMatrix(jaggArray);
    }
    
    public static int[] resizeArray(int[] arra, int newSize){
        if(arra.length < newSize){
            int[] newArra = new int[newSize];
            for(int i = 0; i < arra.length; i++){
                newArra[i] = arra[i];
            }
            for(int j = arra.length; j < newArra.length; j++){
                newArra[j] = 0;
            }
            return newArra;
        }
        return arra;
    }
    
    public static int[] sortLine(int[] arra){
        int min; int flag;
        for(int i = 0; i < arra.length; i++){
            min = 40; flag = 0;
            for(int j = i; j < arra.length; j++){
                if(arra[j] < min){
                    min = arra[j];
                    flag = j;
                }
            }
            arra[flag] = arra[i];
            arra[i] = min;
        }
        return arra;
    }
    
    public static void printMatrix(int[][] array){
            for(int i = 0; i < array.length; i++){
                System.out.print("[ ");
                for(int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println("]");
            }
        }
}