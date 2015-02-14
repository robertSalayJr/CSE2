///////////////////////////////
//Robert Salay
//hw04- WhichNumber
//2/14/2015
//Find the number a user is thinking of between 1-10 w/ y/n questions
import java.util.Scanner;

public class WhichNumber{
    public static void main(String[] args){
        
        //create scanner and holding variable
        Scanner myScanner = new Scanner(System.in);
        String answer = new String();
        
        //Determine # with y/n questions
        System.out.print("Think of a number between 1 and 10. \nIs your number even? ");
        answer = myScanner.next();
        if(answer.equals("y") || answer.equals("Y")){//#/2
            System.out.print("Is it divisible by 3? ");
            answer = myScanner.next();
            if(answer.equals("y")||answer.equals("Y")){ //#/3
                System.out.print("Is your number 6? ");
                answer = myScanner.next();
                if(answer.equals("y")||answer.equals("Y") ){ //#=6
                    System.out.println("Yay!");
                }
                else if(answer.equals("n")||answer.equals("N") ){ //#!=6
                    System.out.println("Quit cheating!");
                }
                else{//#=fish
                    System.out.println("Invalid answer");
                }
            }
            else if(answer.equals("n")||answer.equals("N") ){ //# !/ 3
                System.out.print("Is the number divisible by 4? ");
                answer = myScanner.next();
                if(answer.equals("y")||answer.equals("Y") ){ //#/4
                    System.out.print("Is the result of number/4 greater than 1? ");
                    answer=myScanner.next();
                    if(answer.equals("y")||answer.equals("Y") ){//#/4 = 2
                        System.out.print("Is your number 8? ");
                        answer=myScanner.next();
                        if(answer.equals("y")||answer.equals("Y")){//#=8
                            System.out.println("Yay!");
                        }
                        else if(answer.equals("n")||answer.equals("N")){//#!=8
                            System.out.println("Stop cheating!");
                        }
                        else{//#=fish
                            System.out.println("Invalid answer");
                        }
                    }
                    else if(answer.equals("n")||answer.equals("N")){//#/4=1
                        System.out.print("Is your number 4? ");
                        answer=myScanner.next();
                        if(answer.equals("y")||answer.equals("Y")){//#=4
                            System.out.println("Yay!");
                        }
                        else if(answer.equals("n")||answer.equals("N")){//#!=4
                            System.out.println("Stop cheating!");
                        }
                        else{//#=fish
                            System.out.println("Invalid answer");
                        }
                    }
                    else{
                        System.out.println("Invalid answer");
                    }
                }
                else if(answer.equals("n")||answer.equals("N")){//#!/4
                    System.out.print("Is it divisible by 5? ");
                    answer=myScanner.next();
                    if(answer.equals("y")||answer.equals("Y")){//#/5
                        System.out.print("Is your number 10? ");
                        answer=myScanner.next();
                        if(answer.equals("y")||answer.equals("Y")){//#=10
                            System.out.println("Yay!");
                        }
                        else if(answer.equals("n")||answer.equals("N")){//#!=10
                            System.out.println("Stop cheating!");
                        }
                        else{//#=fish
                            System.out.println("Invalid answer");
                        }
                    }
                    else if(answer.equals("n")||answer.equals("N")){//#!/5
                        System.out.print("Is your number 2? ");
                        answer=myScanner.next();
                        if(answer.equals("y")||answer.equals("Y") ){ //#=6
                            System.out.println("Yay!");
                        }
                        else if(answer.equals("n")||answer.equals("N") ){ //#!=6
                            System.out.println("Quit cheating!");
                        }
                        else{//#=fish
                            System.out.println("Invalid answer");
                        }
                    }
                    else{
                        System.out.println("Invalid answer");
                    }
                }
                else{//#/4 invalid
                    System.out.println("Invalid answer");
                }
            }
            else{//#/3 invalid
                System.out.println("Invalid answer");
            }
        }
        else if(answer.equals("n")||answer.equals("N")){//#!/2
            System.out.print("Is it divisible by 3? ");
            answer=myScanner.next();
            if(answer.equals("y")||answer.equals("Y")){//#/3
                System.out.print("When divided by 3, is the result greater than 1? ");
                answer=myScanner.next();
                if(answer.equals("y")||answer.equals("Y")){//#/3>1
                    System.out.print("Is your number 9? ");
                    answer=myScanner.next();
                    if(answer.equals("y")||answer.equals("Y") ){ //#=9
                        System.out.println("Yay!");
                    }
                    else if(answer.equals("n")||answer.equals("N") ){ //#!=9
                        System.out.println("Quit cheating!");
                    }
                    else{//#=fish
                        System.out.println("Invalid answer");
                    }
                }
                if(answer.equals("n")||answer.equals("N")){//#/3=1
                    System.out.print("Is your number 3? ");
                    answer=myScanner.next();
                    if(answer.equals("y")||answer.equals("Y") ){ //#=3
                        System.out.println("Yay!");
                    }
                    else if(answer.equals("n")||answer.equals("N") ){ //#!=3
                        System.out.println("Quit cheating!");
                    }
                    else{//#=fish
                        System.out.println("Invalid answer");
                    }
                }
            }
            else if(answer.equals("n")||answer.equals("N")){//#!/3
                System.out.print("Is it greater than 6? ");
                answer=myScanner.next();
                if(answer.equals("y")||answer.equals("Y")){//#>6
                    System.out.print("Is your number 7? ");
                    answer=myScanner.next();
                    if(answer.equals("y")||answer.equals("Y") ){ //#=7
                    System.out.println("Yay!");
                    }
                    else if(answer.equals("n")||answer.equals("N") ){ //#!=7
                        System.out.println("Quit cheating!");
                    }
                    else{//#=fish
                        System.out.println("Invalid answer");
                    }
                }
                else if(answer.equals("n")||answer.equals("N")){//#<=6
                    System.out.print("Is it less than 3? ");
                    answer=myScanner.next();
                    if(answer.equals("y")||answer.equals("Y")){//#<3
                        System.out.print("Is your number 1? ");
                        answer=myScanner.next();
                        if(answer.equals("y")||answer.equals("Y") ){ //#=6
                            System.out.println("Yay!");
                        }
                        else if(answer.equals("n")||answer.equals("N") ){ //#!=6
                            System.out.println("Quit cheating!");
                        }
                        else{//#=fish
                            System.out.println("Invalid answer");
                        }
                    }
                    else if(answer.equals("n")||answer.equals("N")){//#>=3
                        System.out.print("Is your number 5? ");
                        answer=myScanner.next();
                        if(answer.equals("y")||answer.equals("Y") ){ //#=6
                            System.out.println("Yay!");
                        }
                        else if(answer.equals("n")||answer.equals("N") ){ //#!=6
                            System.out.println("Quit cheating!");
                        }
                        else{//#=fish
                            System.out.println("Invalid answer");
                        }
                    }
                    else{//#<3 invalid
                        System.out.println("Invalid answer");
                    }
                }
                else{//#>6 invalid
                    System.out.println("Invalid answer");
                }
            }
            else{//#/3 invalid
                System.out.println("Invalid answer");
            }
        }
        else{//#/2 invalid
            System.out.println("Invalid answer");
        }
    }
}