////////////////////////
//Robert Salay
//Lab 04-Cookies
//2/13/2015
//Use input to determine if User has bought enough cookies for everyone
import java.util.Scanner;

public class Cookies{
    public static void main(String[] args){
        //create variables
        int cookiesWant, people, cookiesBrought, totalCookies, cookiesDiff;
        Scanner myScanner = new Scanner(System.in);
        
        //Obtain people # from user, and end program if the user is goofing around
        System.out.print("Enter the number of people: ");
        if (myScanner.hasNextInt()){
            people = myScanner.nextInt();
            if (people < 0){
                System.out.println("Enter a positive int.");
                return;
            }
        }
        else {
            System.out.println("You did not enter an integer.");
            return;
        }
        
        //obtain cookie#, and end program if user enters wrong answer
        System.out.print("Enter the number of cookies you're buying: ");
        if (myScanner.hasNextInt()){
            cookiesBrought = myScanner.nextInt();
           if (cookiesBrought < 0){
            System.out.println("Enter a positive int.");
            return;
           }
        }
        else {
            System.out.println("You did not enter an integer.");
            return;
        }
        
        //obtain how many cookies each person wants, and turn into total cookies wanted
        //end program if user doesn't enter proper integer
        System.out.print("How many cookies should each person get?: ");
        if (myScanner.hasNextInt()){
            cookiesWant = myScanner.nextInt();
           if (cookiesWant < 0){
            System.out.println("Enter a positive int.");
            return;
           }
        }
        else {
            System.out.println("You did not enter an integer.");
            return;
        }
        totalCookies = cookiesWant * people;
        
        if (totalCookies <= cookiesBrought){
            if (people != 0){
                if (cookiesBrought % people == 0){
                    System.out.println("You have enough cookies for each person and the amount will divide evenly.");
                }
                else if (cookiesBrought % people != 0){
                    System.out.println("You have enough, but they will not divide evenly.");
            }
            }
            else{
                System.out.println("You have enough cookies for each person and the amount will divide evenly.");
            }
        }
        else{
            cookiesDiff = totalCookies - cookiesBrought;
            System.out.println("You will not have enough cookies. You need to buy at least "
            + cookiesDiff + " more.");
        }    
        }
    }