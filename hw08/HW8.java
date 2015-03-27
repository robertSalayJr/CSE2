/////////////////////
//Robert Salay
//HW08- MG's Adventure World
//3/21/15
// Create an ASCII game using multiple methods.
import java.util.Scanner;
public class HW8{
    public static void main(String[] args) {
            char option;
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            String input = getInput(scan, "Cc");
            
            System.out.println("You are in a dead valley.");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            
            System.out.println("You walked and walked and walked and you saw a cave!");
            cave();
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            
            System.out.println("You entered a cave!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            
            System.out.println("Unfortunately, you ran into a GIANT!");
            giant();
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            input = getInput(scan, "AaEe", 10);
            
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
            System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
            box();
            input = getInput(scan);
            System.out.println("Hero! Have a good day!");
    }
    
     public static void giant() {  //prints an ASCII picture of a giant
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

   public static void cave() { //prints an ASCII cave
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }

    public static void box(){ //prints an ASCII set of boxes
        System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

    public static String getInput (Scanner scan, String string){
        if (string.contains(scan.next())){
            return "correct";
        } else {
            System.out.println("Yea right LOSER!");
            System.exit(0);
            return "incorrect";
        }
    }
    
    public static String getInput (Scanner scan, String string, int trial){
        int counter = 0; int rand = 0;
        while (counter < trial){
            String chosen = scan.next();
            if(string.contains(chosen)){
                if(chosen.equals("A") || chosen.equals("a") ){
                    rand = (int)(Math.random() * 2);
                if (rand == 1){
                    System.out.println("Critical Hit!");
                    counter ++;
                } else {
                    System.out.println("Gosh! How can you miss it!");
                }
                } else if (chosen.equals("E") || chosen.equals("e") ){
                    rand = (int)(Math.random() * 10 ) + 1;
                    if (rand == trial){
                        System.out.println("You successfully escaped!");
                        counter = trial;
                    } else {
                        System.out.println("You failed to escape!");
                    }
                }
            } else {
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            }
            
            if (counter < trial){
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
            }
        }
        return "correct";
    }
    
    public static String getInput (Scanner scan){
        int chosen = 0;
        if (scan.hasNextInt()){
            chosen = scan.nextInt();
        }
        switch(chosen){
            case 1:
                System.out.print("It's a passing grade! ");
                break;
            case 2:
                System.out.print("It's an Incredibly Deadly Viper! ");
                break;
            case 3:
                System.out.print("It's tickets to that thing you like! Now it's diamonds!");
                break;
            default:
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
        }
        
        return "correct";
    }
}