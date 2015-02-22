/////////////////////
//Robert Salay
//hw05- To Hex
//2/21/2015
//Turn 3 user-entered integers[0-255] into hexadecimal code
import java.util.Scanner;

public class ToHex{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        int red, green, blue;
        String hex = "";
        
        //Prompt for input
        System.out.println("Please enter 3 numbers representing RGB values[0-255]:");
        if (myScanner.hasNextInt()){
            red = myScanner.nextInt();
            if(red <= 255 && red >=0){
                if(myScanner.hasNextInt()){
                    green = myScanner.nextInt();
                    if(green <=255 && green >= 0){
                        if(myScanner.hasNextInt()){
                            blue = myScanner.nextInt();
                            if(blue <= 255 && blue >= 0){
                                
                            } else{ //3rd value <0 || >255
                                System.out.println("Sorry, you must enter values between 0-255.");
                                return;
                            }
                        } else { //3rd != int
                            System.out.println("Sorry, your input must consist of integers.");
                            return;
                        }
                    } else { //2nd value <0 || >255
                        System.out.println("Sorry, you must enter values between 0-255.");
                        return;
                    }
                } else{ //2nd != int
                    System.out.println("Sorry, your input must consist of integers.");
                    return;
                }
            } else { //1st value <0 || > 255
                System.out.println("Sorry, you must enter values between 0-255.");
                return;
            }
        } else{ //1st != int
            System.out.println("Sorry, your input must consist of integers.");
            return;
        }
        
        //values obtained, next we must convert them into hexadecimal.
        switch((red/16)){ //1st # of hex
            case 15:
                hex = hex + "F";
                break;
            case 14:
                hex = hex + "E";
                break;
            case 13:
                hex = hex + "D";
                break;
            case 12:
                hex = hex + "C";
                break;
            case 11:
                hex = hex + "B";
                break;
            case 10:
                hex = hex + "A";
                break;
            default:
                hex = hex + red/16;
        }
        switch((red%16)){ //2nd # of hex
            case 15:
                hex = hex + "F";
                break;
            case 14:
                hex = hex + "E";
                break;
            case 13:
                hex = hex + "D";
                break;
            case 12:
                hex = hex + "C";
                break;
            case 11:
                hex = hex + "B";
                break;
            case 10:
                hex = hex + "A";
                break;
            default:
                hex = hex + red%16;
        }
        switch((green/16)){ //3rd # of hex
            case 15:
                hex = hex + "F";
                break;
            case 14:
                hex = hex + "E";
                break;
            case 13:
                hex = hex + "D";
                break;
            case 12:
                hex = hex + "C";
                break;
            case 11:
                hex = hex + "B";
                break;
            case 10:
                hex = hex + "A";
                break;
            default:
                hex = hex + green/16;
        }
        switch((green%16)){ //4th # of hex
            case 15:
                hex = hex + "F";
                break;
            case 14:
                hex = hex + "E";
                break;
            case 13:
                hex = hex + "D";
                break;
            case 12:
                hex = hex + "C";
                break;
            case 11:
                hex = hex + "B";
                break;
            case 10:
                hex = hex + "A";
                break;
            default:
                hex = hex + green%16;
        }
        switch((blue/16)){ //5th # of hex
            case 15:
                hex = hex + "F";
                break;
            case 14:
                hex = hex + "E";
                break;
            case 13:
                hex = hex + "D";
                break;
            case 12:
                hex = hex + "C";
                break;
            case 11:
                hex = hex + "B";
                break;
            case 10:
                hex = hex + "A";
                break;
            default:
                hex = hex + blue/16;
        }
        switch((blue%16)){ //6th # of hex
            case 15:
                hex = hex + "F";
                break;
            case 14:
                hex = hex + "E";
                break;
            case 13:
                hex = hex + "D";
                break;
            case 12:
                hex = hex + "C";
                break;
            case 11:
                hex = hex + "B";
                break;
            case 10:
                hex = hex + "A";
                break;
            default:
                hex = hex + blue%16;
        }
        System.out.println("The decimal numbers R:" + red + ", G:" + green +
        ", B:" + blue + ", is represented in hexadecimal as: " + hex);
    }
}