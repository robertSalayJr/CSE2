//////////////////////////////
//Robert Salay
//Lab 09 - Sentences
//3/21/2015
// Create a sentence generator using random numbers and multiple methods

import java.util.Random;
import java.util.Scanner;
public class Sentences{
    public static void main (String [] args){ //creates a sentence using other methods
        int counter = 0;
        Scanner myScanner = new Scanner(System.in);
        String input;
        while (counter == 0){
            System.out.println("The "+adjective()+" "+adjective()+" "+subjectNoun()+" "+
            verb()+" the "+adjective()+" "+objectNoun() ); //prints sentence w/ methods
            
            System.out.print("Would you like another sentence? (Yy): ");
            input = myScanner.next();
            if(input.equals("Y") || input.equals("y") ){
                counter = 0;
            } else{
                counter = 1; //ends loop if user doesn't want another sentence
            }
        }
    }
    public static String adjective(){ // selects 1 of 10 adjectives using a random #
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        switch(randomInt){  //breaks not needed: return ends method
        case 0:
            return "quick";
        case 1:
            return "lazy";
        case 2:
            return "brown";
        case 3:
            return "orange";
        case 4:
            return "short";
        case 5:
            return "slow";
        case 6:
            return "shaggy";
        case 7:
            return "puce";
        case 8:
            return "clever";
        case 9:
            return "thin";
        default:
            return "wrong";
        }
    }
    public static String objectNoun(){ //selects 1 of 10 obj. nouns using a random #
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        switch(randomInt){
            case 0:
                return "dog";
            case 1:
                return "cat";
            case 2:
                return "tractor";
            case 3:
                return "cow";
            case 4:
                return "squirrel";
            case 5:
                return "mouse";
            case 6:
                return "rat";
            case 7:
                return "ball";
            case 8:
                return "rock";
            case 9:
                return "person";
            default:
                return "error";
        }
    }
    public static String subjectNoun(){ //selects 1 of 10 subj. nouns using a rand. #
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        switch(randomInt){
            case 0:
                return "fox";
            case 1:
                return "cat";
            case 2:
                return "xenomorph";
            case 3:
                return "cow";
            case 4:
                return "squirrel";
            case 5:
                return "mouse";
            case 6:
                return "rat";
            case 7:
                return "armadillo";
            case 8:
                return "rock";
            case 9:
                return "person";
            default:
                return "error";
        }
    }
    public static String verb(){ // selects 1 of 10 verbs using a random number
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        switch(randomInt){
            case 0:
                return "passed";
            case 1:
                return "jumped";
            case 2:
                return "ate";
            case 3:
                return "bit";
            case 4:
                return "sniffed";
            case 5:
                return "saw";
            case 6:
                return "heard";
            case 7:
                return "despised";
            case 8:
                return "had a pleasant conversation with";
            case 9:
                return "ignored";
            default:
                return "glitched";
        }
    }
}