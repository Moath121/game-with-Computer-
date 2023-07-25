import java.util.Scanner;



import java.util.Random;

public class Main {
    public static void main(String[] args) {

       Random rand = new Random();
       Scanner read = new Scanner(System.in);
       System.out.println("Rock , Paper, scissors Game with th Computer");
       System.out.println("R for Rock");
       System.out.println("P for Paper");
       System.out.println("S for scissors");
       boolean stop = false;
       String[] comp = {"P", "R", "S"};

       while (stop == false) {
           System.out.print("Enter your Input: ");
           String c = read.next();
           int randnum = rand.nextInt(3);
           String Comp = comp[randnum];

           if (c.equals("R")){
               if (Comp.equals("R")){
                   System.out.println("No wan Won");
               } else if (Comp.equals("P")) {
                   System.out.println("The Computer Won he chose Paper");
               }else {
                   System.out.println("You Won!");
               }
           } else if (c.equals("S")) {
               if (Comp.equals("S")){
                   System.out.println("No One Won");
               } else if (Comp.equals("P")) {
                   System.out.println("You Won !!");
               }else {
                   System.out.println("The Computer Won it chose Rock");
               }
           } else if (c.equals("P")) {
               if (Comp.equals("P")){
                   System.out.println("No One Won");
               } else if (Comp.equals("S")) {
                   System.out.println("The Computer Won it chose  scissors");
               }else {
                   System.out.println("You Won");
               }

           } else {
               System.out.println("Error wrong input");
           }
           System.out.print("Play again?: ");
           String x = read.next();
           if (x.equals("n")){
               break;
           }
       }
    }
}

