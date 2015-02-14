///////////////////////////////
//Robert Salay
//hw04- Banking
//2/14/2015
// Start the user with $1000-5000, the let them deposit, withdraw, or view balance
import java.util.Scanner;

public class Banking{
    public static void main(String[] args){
        //create variables
        int balance = (int)(Math.random()*4001) + 1000;
        int inputCash;
        String inputString = new String();
        Scanner myScanner = new Scanner(System.in);
        
        //Determine whether user wants to deposit, withdraw, or view balance
        System.out.println("Would you like to withdraw, deposit, or view their balance?");
        inputString = myScanner.next();
        if(inputString.equals("withdraw")){
            System.out.println("You have $" + balance + " dollars in your account.\n" +
             "How much would you like to withdraw?");
             if(myScanner.hasNextInt()){
                inputCash = myScanner.nextInt();
                if(inputCash >=0 && inputCash <=balance){
                    balance -= inputCash;
                    System.out.println("Withdrawal successful. You have $" + balance + " left.");
                }
                else{
                    System.out.println("Withdrawal failed. Please enter a proper amount.");
                }
             }
             else{
                 System.out.println("Withdrawal failed. Please enter a proper amount.");
             }
        }
        else if(inputString.equals("deposit")){
            System.out.println("You have $" + balance + " dollars.\n" +
            "How much would you like to deposit?");
            if(myScanner.hasNextInt()){
                inputCash = myScanner.nextInt();
                if(inputCash >=0){
                    balance += inputCash;
                    System.out.println("Deposit successful. You have $" + balance + " now.");
                }
                else{
                    System.out.println("Deposit failed. Enter a proper amount.");
                }
            }
            else{
                System.out.println("Deposit failed. Enter a proper amount.");
            }
        }
        else if(inputString.equals("view")){
            System.out.println("You have $" + balance);
        }
        else{
            System.out.println("Please enter a valid command.");
        }
    }
}