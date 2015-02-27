/////////////////////
//Robert Salay
//lab06 -  Smile Generator
//2/21/2015
// output smiles using loops

public class SmileGenerator{
    public static void main (String[]args){
        for(int i = 1; i<6; i++){ //step 1 part 1: 5 smiles w/ for loop
            System.out.print(":)");
        }
        System.out.println("\n"); //separate smile lines
        
        int count = 1;
        while (count < 6){ //step 1 part 2: 5 smiles w/ while loop
            System.out.print(":)");
            count++;
        }
        System.out.println("\n");
        
        count = 1;
        do { //step 1 part 3: 5 smiles w/ do loop
            System.out.print(":)");
            count++;
        } while (count < 6);
        
        System.out.println("\n");
        
        //Step 2 1-100 smiles
        int maxCount = (int)(Math.random()*100) + 2; //creates a random # 2-101
        for(int i = 1; i < maxCount; i++){ //loop will only operate max of 100 times
            System.out.print(":)");
        }
        System.out.println("\n");
        
        //Step 3: 1-100 smiles, 30 per line
        count = 1;
        for(int i = 1; i < maxCount; i++){
            if (count == 30){
                System.out.println(":)"); //start new line on 30th :)
                count = 1; //reset :) count
            } else{
                System.out.print(":)");
                count++;
            }
        }
        System.out.println("\n");
        
        //Step 4: 1-100 smiles, 1 on 1st, 2 on 2nd, etc.
        count = 1;
        int lineCount = 1;
        for(int i = 1; i<maxCount; i++){
            if(count >= lineCount){
                System.out.println(":)");
                count = 1;
                lineCount++;
            } else{
                System.out.print(":)");
                count++;
            }
        }
        System.out.print("\n");
    }
}