////////////////////
//Robert Salay
//HW 10 - Remove Elements
//4/5/2015
// Create a multi-method program that removes user-chosen elements from an array

import java.util.Random;
import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
    String answer="";
    do{
      System.out.print("Random input 10 ints [0-9]");
      num = randomInput();
      String out = "The original array is:";
      out += listArray(num);
      System.out.println(out);
 
      System.out.print("Enter the index ");
      index = scan.nextInt();
      newArray1 = delete(num,index);
      String out1="The output array is ";
      out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
      System.out.println(out1);
 
      System.out.print("Enter the target value ");
      target = scan.nextInt();
      newArray2 = remove(num,target);
      String out2="The output array is ";
      out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
      System.out.println(out2);
       
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static int[] randomInput(){
      Random randomGenerator = new Random();
      int[] list;
      list = new int[10];
      for(int i = 0; i<10; i++){
          int nextOne = randomGenerator.nextInt(10); //creates a random int 0-9 for each point in array
          list[i] = nextOne;
      }
      return list;
  }
  
  public static int[] delete(int[] list, int pos){
      int[] newList;
      newList = new int[9]; //one point, chosen by user, is removed, so newList only has to be 9 points instead of 10
      for(int i = 0; i<9; i++){
          if(i < pos - 1){
              newList[i] = list[i];
          } else {
              newList[i] = list[i+1]; //skips chosen position when moving points from list to newList
          }
      }
      return newList;
  }
  
  public static int[] remove(int[] list, int target){
      int[] newList;
      int counter = 0;
      for(int i = 0; i<10; i ++){
          if (list[i] == target){
              counter ++;
          }
      }
      newList = new int[10-counter]; // size of newList is list - every point that will be removed
      int pos = 0;
      for(int i = 0; i<10; i++){
          if(list[i] != target){ //loop only transcribes value of list to newList if it isn't the int chosen by user
              newList[pos] = list[i];
              pos++; //position in newList only changes in the loop when it has been filled
          }
      }
      return newList;
  }
}

