///////////////////
//Robert Salay
//Homework 03
//2/8/2015
//Find the distance and average speed of a bicycle ride using inputted #s
import java.util.Scanner;//import scanner

public class Bicycle{
    
    public static void main(String[] args){
        
        //create variables to store data
        Scanner myScanner = new Scanner(System.in);
        int sec, counts, diameter;
        double length, speed, minutes, simpLength;
        
        //Get data from user
        System.out.print("Enter the number of seconds: ");
        sec = myScanner.nextInt();
        System.out.print("Enter the number of counts: ");
        counts = myScanner.nextInt();
        diameter = 27;
        
        //calculate output data
        length = diameter * 3.14159 * counts;
        length /= 12; //feet
        length /=5280; //miles
        minutes = sec/60;
        
        //simplify length
        int mile, tenth, hundth, thousth;
        mile = (int)length;
        tenth = (int)(length * 10)%10;
        hundth = (int)(length * 100)%10;
        
        //print out data
        System.out.println("The distance was " + mile +
        "." + tenth + hundth +
        " miles and took " + minutes + " minutes.");
        minutes /= 60; //convert to hours
        
        //caculate the average speed
        speed = length / minutes; //miles per hour
        mile = (int) speed;
        tenth = (int) (speed * 10)%10;
        hundth = (int) (speed * 100)%10;
        System.out.println("The average mph was " + mile + "." + tenth + hundth);
    }
}