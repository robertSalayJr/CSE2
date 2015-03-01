/////////////////////
//Robert Salay
//hw 06 - Make Symbols
//2/28/2015
// Create an int [1-100], display # of * if even, & if odd
public class MakeSymbols{
    public static void main(String[]args){
        int rando = (int)(Math.random() * 100) + 1; //generate # 1-100
        System.out.println("Random number generated: " + rando); 
        for(int i=1; i<=rando; i++){
            if(rando%2==0){ //if # generated is even
                System.out.print("*");
            }else{ //if # generated is odd
                System.out.print("&");
            }
        }
        System.out.print("\n"); //neaten next command line
    }
}