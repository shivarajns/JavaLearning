import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double compGuess = Math.random()*10;
        compGuess = Math.round(compGuess);
        int playerGuess;
        int tryed = 1;
        System.out.print("Guess A Number: ");
        playerGuess = scanner.nextInt();

        while(compGuess != playerGuess){
            System.out.print("Wrong Guess, Try Again: ");
            playerGuess = scanner.nextInt();
            tryed++;
        }

        System.out.println("Right Guess you won.");
        System.out.printf("You take %d Chances to Guess Correct number",tryed);
    }
}
