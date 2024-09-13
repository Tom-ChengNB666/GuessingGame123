import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Random rand = new Random();
        int x = rand.nextInt(100);
        int MAX_GUESSES = 10;

        Scanner scan  = new Scanner(System.in);
        int guess;
        int count=0;

        do { 
            System.out.print("Enter your guess:");
            guess= scan.nextInt();
            count++;
             
            if(guess<x){
                System.out.println("Too low!");
                }
                else if (guess > x){
                    System.out.println("Too High!");
                }
                


            
        } while (guess != x && count <= MAX_GUESSES);
        System.out.println(guess);
         if (count>10){
                    System.out.println("You loose, try again");

                 }
                 if (count<=7){
                    System.out.println("You got an impossibly good score!");
                 }
                 if (count>7 && count <=10){
                    System.out.println("You did a good job!");
                 }
                 else {
                    System.out.println("Try the divide and conquer strategy next time!");
                    System.out.println("The correct number was: " + x);
                 }
                 scan.close();
    }

}    
