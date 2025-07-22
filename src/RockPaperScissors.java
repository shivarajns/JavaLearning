import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("Welcome to the Game of Rock, Paper, Scissors");
        System.out.println("**********************************************");

        String userChoise="";
        int totalScore=0;
        int numofmatches=0;

        while (!userChoise.equals("EXIT")){
            System.out.println("Rock");
            System.out.println("Paper");
            System.out.println("Scissor");
            System.out.println("Exit");
            System.out.print("Choose your Option: ");

            //System choises :
            String[] SysChoises = {"ROCK", "PAPER", "SCISSOR"};
            Random random = new Random();
            int num = random.nextInt(0,3);
            String SysChoise = SysChoises[num];
            userChoise = scanner.nextLine().toUpperCase();

            if(SysChoise.equals(userChoise)){
                System.out.println("**********************************************");
                System.out.println("Match Tie");
                System.out.println("**********************************************");
            }
            else if(SysChoise.equals("ROCK") && userChoise.equals("PAPER")){
                System.out.println("**********************************************");
                System.out.println("You Win");
                System.out.println("**********************************************");
                totalScore+=1;
                numofmatches+=1;

            }
            else if(SysChoise.equals("PAPER") && userChoise.equals("SCISSOR")){
                System.out.println("**********************************************");
                System.out.println("You Win");
                System.out.println("**********************************************");
                totalScore+=1;
                numofmatches+=1;
            }
            else if(SysChoise.equals("SCISSOR") && userChoise.equals("ROCK")){
                System.out.println("**********************************************");
                System.out.println("You Win");
                System.out.println("**********************************************");
                totalScore+=1;
                numofmatches+=1;
            }
            else if(SysChoise.equals("PAPER") && userChoise.equals("ROCK")){
                System.out.println("**********************************************");
                System.out.println("You Loss");
                System.out.println("**********************************************");
                numofmatches+=1;
            }
            else if(SysChoise.equals("SCISSOR") && userChoise.equals("PAPER")){
                System.out.println("**********************************************");
                System.out.println("You Loss");
                System.out.println("**********************************************");
                numofmatches+=1;
            }
            else if(SysChoise.equals("ROCK") && userChoise.equals("SCISSOR")){
                System.out.println("**********************************************");
                System.out.println("You Loss");
                System.out.println("**********************************************");
                numofmatches+=1;
            }

        }

        System.out.println("**********************************************");
        System.out.println("Game Ended");
        System.out.println("Your Score is "+totalScore+" Out of "+numofmatches+" Matches");
        System.out.println("**********************************************");








         scanner.close();
    }
}
