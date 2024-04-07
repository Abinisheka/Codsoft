import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        boolean playagain = true;

        while (playagain) {
            int randnum = r.nextInt(100) + 1;
            int tries = 0;
            int maxguess = 6;
            int userguess;


            while (tries < maxguess) {
                System.out.println("** Lets play Guess the Number Game **");
                System.out.println("Guess a Number Between 1 to 100:");
                userguess = sc.nextInt();
                tries++;

                if (userguess == randnum) {
                    System.out.println("Your Guess is correct.. HURRAH!!");
                    System.out.println("It Took  you  " + tries + " tries to guess");
                    break;
                } else if (randnum > userguess) {
                    System.out.println("The number is too high");

                } else {
                    System.out.println("The number is too low");
                }
            }
            if (tries == maxguess) {
                System.out.println("Sorry you had reached the limit!!");
            }
            if(tries>0){
                double guess=(double) maxguess/tries*100;
                System.out.println("Your Score is:" +guess);
            }
            System.out.println("Do you want to play again(yes/no):");
            String play = sc.next().toLowerCase();
            playagain = play.equals("yes");

        }
        System.out.println("** Game is over **");
        sc.close();
    }
}
