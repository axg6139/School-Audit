/*
*Created by Alexis Saul Garcia
* Final Project
*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //METHODS THAT WILL BE EXECUTED
        gameIntro();
        spacing();
        gameTable();
        gameInstruction();
        gameFunction();
        gameFunctionTwo();
        gameFunctionThree();
        gameFunctionFour();
        gameFunctionFinal();
    }

    //INTRO TO LUCKY 34
    public static void gameIntro() {
        System.out.print("Welcome to Lucky 34!");
        timeOne();
        System.out.println(" This game is quite simple.");
        timeOne();
        spacing();
        System.out.println("I will print out the following sequence of numbers and you will choose four numbers");
        System.out.println("that are on different rows as well as columns. They will equal to 34.");
        timeOne();
    }

    public static void gameTable(){
        timeTwo(); //LONGER TIME DELAY FOR USER READABILITY
        System.out.println("          " + "1" + "     2" + "     3" + "     4");
        System.out.println(); //SIMPLY ADDING A LINED SPACE
        System.out.println("          " + "5" + "     6" + "     7" + "     8");
        System.out.println(); //SIMPLY ADDING A LINED SPACE
        System.out.println("          " + "9" + "     10" + "    11" + "    12");
        System.out.println(); //SIMPLY ADDING A LINED SPACE
        System.out.println("          " + "13" + "    14" + "    15" + "    16");
        spacing();
        timeOne();
        System.out.println("For example, if you choose '1'  then the following numbers are allowed to be chosen");
        spacing();
        timeOne();
        System.out.println("          " + "x" + "      x" + "     x" + "     x");
        System.out.println(); //SIMPLY ADDING A LINED SPACE
        System.out.println("          " + "x" + "     6" + "      7" + "     8");
        System.out.println(); //SIMPLY ADDING A LINED SPACE
        System.out.println("          " + "x" + "     10" + "     11" + "    12");
        System.out.println(); //SIMPLY ADDING A LINED SPACE
        System.out.println("          " + "x" + "     14" + "     15" + "    16");
        spacing();
        timeOne();
    }

    //INSTRUCTIONS OF THE GAME
    public static void gameInstruction(){
        System.out.println("Let us begin. Please enter your name...");
        Scanner GameRead = new Scanner(System.in); //SCANNER FOR NAME OF THE GAMER
        String nameOfGamer = GameRead.nextLine();
        System.out.println("Welcome, " + nameOfGamer); //OUTPUTS THE GAMERS NAME
        timeOne();
        System.out.println("Let's begin the game. REMINDER: Write down all the numbers you provided, you will need them towards the end of the game.");
        System.out.println("Enter a number from the first row after the table has been provided");
        timeOne();
        spacing();
        System.out.println("          " + "1" + "     2" + "     3" + "     4");
        System.out.println(); //SIMPLY ADDING A LINED SPACE
        System.out.println("          " + "5" + "     6" + "     7" + "     8");
        System.out.println(); //SIMPLY ADDING A LINED SPACE
        System.out.println("          " + "9" + "     10" + "    11" + "    12");
        System.out.println(); //SIMPLY ADDING A LINED SPACE
        System.out.println("          " + "13" + "    14" + "    15" + "    16");
        timeOne();
        spacing();

        }

        //THE WORK BEHIND THE GAME IS PERFORMED HERE
        public static void gameFunction() {
            Scanner GameRead = new Scanner(System.in);
            String rowOptionOne = GameRead.nextLine();
            String numberOne = rowOptionOne;
            switch (rowOptionOne) { //NAME OF THE SWITCH
                case "1": //CASE THEY CHOOSE '1' AS THE FIRST NUMBER
                    System.out.println("You chose '1' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     6" + "     7" + "     8");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     10" + "    11" + "    12");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     14" + "    15" + "    16");
                    break;
                case "2": // CASE THEY CHOOSE '2' AS THE FIRST NUMBER
                    System.out.println("You chose '2' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "5" + "     x" + "     7" + "     8");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "9" + "     x" + "     11" + "    12");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "13" + "    x" + "     15" + "    16");
                    break;
                case "3":
                    System.out.println("You chose '3' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "5" + "     6" + "     x" + "     8");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "9" + "     10" + "    x" + "     12");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "13" + "    14" + "    x" + "     16");
                    break;
                case "4":
                    System.out.println("You chose '4' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "5" + "     6" + "     7" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "9" + "     10" + "    11" + "    x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "13" + "    14" + "    15" + "    x");
                    break;


            }
            spacing();
            System.out.println("You chose the following number: " + numberOne);//AS A REFERENCE IN CASE THEY FORGOT THEIR NUMBER
        }
            public static void gameFunctionTwo(){
            System.out.println("Now choose one of the next available numbers from the second row: ");
            Scanner GameRead = new Scanner(System.in);
            String rowOptionTwo = GameRead.nextLine();
            String numberTwo = rowOptionTwo;
            switch(rowOptionTwo) {
                case "5":
                    System.out.println("You chose '5' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     X" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     10" + "    11" + "    12");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     14" + "    15" + "    16");
                    break;
                case "6":
                    System.out.println("You chose '6' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "9" + "     x" + "     11" + "    12");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "13" + "    x" + "     15" + "    16");
                    break;
                case "7":
                    System.out.println("You chose '7' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "    x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "    x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "9" + "     10" + "    x" + "    12");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "13" + "    14" + "    x" + "    16");
                    break;
                case "8":
                    System.out.println("You chose '8' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "9" + "     10" + "    11" + "    x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "13" + "    14" + "    15" + "    x");
            }
            spacing();
                System.out.println("You chose the following number: " + numberTwo);//AS A REFERENCE IN CASE THEY FORGOT THEIR NUMBER
        }

        public static void gameFunctionThree(){
            System.out.println("Now choose one of the next available numbers from the third row: ");
            Scanner GameRead = new Scanner(System.in);
            String rowOptionThree = GameRead.nextLine();
            String numberThree = rowOptionThree;
            switch(rowOptionThree) {
                case "9":
                    System.out.println("You chose '9' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     14" + "    15" + "    16");
                    break;
                case "10":
                    System.out.println("You chose '10' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "13" + "    x" + "     15" + "    16");
                    break;
                case "11":
                    System.out.println("You chose '11' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "13" + "    14" + "    x" + "     16");
                    break;
                case "12":
                    System.out.println("You chose '12' thus leaving these as your next options ");
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "x" + "     x" + "     x" + "     x");
                    System.out.println(); //SIMPLY ADDING A LINED SPACE
                    System.out.println("          " + "13" + "    14" + "    15" + "    x");
                    break;
                }
                spacing();
            System.out.println("You chose the following number: " + numberThree);//AS A REFERENCE IN CASE THEY FORGOT THEIR NUMBER
            }
            public static void gameFunctionFour(){
                System.out.println("Now choose your final number to finish the Lucky 34 game :)");
                Scanner GameRead = new Scanner(System.in);
                String rowOptionFour = GameRead.nextLine();
                String numberFour = rowOptionFour;
                switch(rowOptionFour) {
                    case "13":
                        System.out.println("You chose '13' thus finalizing your choices");
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        break;
                    case "14":
                        System.out.println("You chose '14' thus finalizing your choices");
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        break;
                    case "15":
                        System.out.println("You chose '15' thus finalizing your choices");
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        break;
                    case "16":
                        System.out.println("You chose '16' thus finalizing your choices");
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        System.out.println(); //SIMPLY ADDING A LINED SPACE
                        System.out.println("          " + "x" + "     x" + "     x" + "     x");
                        break;
                }
                spacing();
                System.out.println("You chose the following number: " + numberFour); //AS A REFERENCE IN CASE THEY FORGOT THEIR NUMBER
            }
            public static void gameFunctionFinal(){
                System.out.println("Now you will enter your numbers you used and will get the sum of 34 :)");
                //THEY ENTER THE NUMBERS THEY USED UP ABOVE AND GET THE CALCULATED ANSWER
                Scanner GameRead = new Scanner(System.in);

                //FIRST NUMBER
                String rowOptionOne = GameRead.nextLine();
                int numberOne = Integer.parseInt(rowOptionOne);

                //SECOND NUMBER
                String rowOptionTwo = GameRead.nextLine();
                int numberTwo = Integer.parseInt(rowOptionTwo);

                //THIRD NUMBER
                String rowOptionThree = GameRead.nextLine();
                int numberThree = Integer.parseInt(rowOptionThree);

                //FOURTH NUMBER
                String rowOptionFour = GameRead.nextLine();
                int numberFour = Integer.parseInt(rowOptionFour);

                //FINAL ANSWER
                int finalAnswer = numberOne + numberTwo + numberThree + numberFour;
                System.out.println("Your final answer is: " + finalAnswer);
                timeOne();
                System.out.println("Thank you for playing :)");

            }



    //ADDS TIME DELAY FOR USER READABILITY
    public static void timeOne(){
        try{Thread.sleep(2500);}
        catch(InterruptedException ex){}
    }



    //ADDS A LONGER TIME DELAY
    public static void timeTwo(){
        try{Thread.sleep(3000);}
        catch(InterruptedException ex){}
    }

    //ADDS SPACING FOR READABILITY PURPOSES
    public static void spacing(){
        System.out.println();
        System.out.println();

    }
}
