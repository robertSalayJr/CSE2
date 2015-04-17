////////////////
//Robert Salay
// Lb 12 - Multi-Dimensional Arrays
// 4/17/2015
// Create multiD arrays and perform methods using them.
public class MultiDArrays {
    public static void main (String[]args){
        int widthA = (int)(Math.random() * 4) + 1;
        int widthB = (int)(Math.random() * 4) + 1;
        int heightA = (int)(Math.random() * 4) + 1; 
        int heightB = (int)(Math.random() * 4) + 1;
        
        int[][] arrayA = new int[heightA][widthA];
        int[][] arrayB = new int[widthA][heightA];
        int[][] arrayC = new int[heightB][widthB];
        System.out.println("Generating a matrix with width " + widthA + " and height " + heightA + ":");
        arrayA = increasingMatrix(widthA, heightA, true);
        printMatrix(arrayA, true);
        System.out.println("Generating a matrix with width " + widthA + " and height " + heightA + ":");
        arrayB = increasingMatrix(widthA, heightA, false);
        printMatrix(arrayB, false);
        System.out.println("Generating a matrix with width " + widthB + " and height " + heightB + ":");
        arrayC = increasingMatrix(widthB, heightB, true);
        printMatrix(arrayC, true);
        System.out.println("Adding two matrices.");
        printMatrix(addMatrix(arrayA, true, arrayB, false), true);
        
        int[][] arrayD = new int [heightA][widthA];
        arrayD = addMatrix(arrayA, true, arrayC, true);
        if(arrayD != null){
            printMatrix(arrayD, true);
        }
    }
    
    public static int[][] increasingMatrix(int width, int height, boolean format){
        int intCounter = 1;
        int[][] arra;
        if(format){
            arra = new int[height][width];
            for(int i = 0; i < height; i++){
                for(int j = 0; j < width; j++){
                    arra[i][j] = intCounter;
                    intCounter++;
                }
            }
        } else {
            arra = new int[width][height];
            for(int i = 0; i<height; i++){
                for(int j = 0; j<width; j++){
                    arra[j][i] = intCounter;
                    intCounter++;
                }
            }
        }
        
        return arra;
    }
    
    public static void printMatrix(int[][] array, boolean format){
        if(format){
            for(int i = 0; i < array.length; i++){
                System.out.print("[ ");
                for(int j = 0; j < array[0].length; j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println("]");
            }
        } else{
            for(int i = 0; i < array[0].length; i++){
                System.out.print("[ ");
                for(int j = 0; j < array.length; j++){
                    System.out.print(array[j][i] + " ");
                }
                System.out.println("]");
            }
        }
    }
    
    public static int[][] translate(int[][] array){
        int[][] newArray = new int [array[0].length][array.length];
        
        for(int i=0; i < array[0].length; i++){
            for(int j = 0; j < array.length; j++){
                newArray[i][j] = array[j][i];
            }
        }
        
        return newArray;
    }
    
    public static int[][] addMatrix(int[][] a, boolean formata, int[][] b, boolean formatb){
        if(!formata){
            a = translate(a);
        }
        if(!formatb){
            b = translate(b);
        }
        
        if(a.length == b.length && a[0].length == b[0].length){
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j <a[0].length; j++){
                    a[i][j] = (a[i][j] + b[i][j]);
                }
            }
            return a;
        } else {
            System.out.println("The arrays cannot be added!");
            return null;
        }
    }
}