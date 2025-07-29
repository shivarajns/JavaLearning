import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        double balance =100;
        double win;
        double betAmount = 0;

        String Ask = "Y";
        Scanner scanner=new Scanner(System.in);

        while (Ask.equals("Y") && balance >=betAmount){
            System.out.println("Welcome to java Slot Machine game");
            System.out.println("*********************************");
            System.out.println("Symbols: 🔔 🍌 🤑 🍒");
            System.out.println("*********************************");

            System.out.println("Your Balance Amount is: " + balance);
            System.out.print("Enter the betting Amount: ");
            betAmount = scanner.nextDouble();
            scanner.nextLine();
            if(betAmount <= balance) {
                System.out.println("Spinning...........");
                String[] symbols = {"🔔", "🍌", "🤑", "🍒" };

                Random random = new Random();
                int a = random.nextInt(4);
                int b = random.nextInt(4);
                int c = random.nextInt(4);

                System.out.println(symbols[a] + " | " + symbols[b] + " | " + symbols[c]);

                if (a==b && b==c) {
                    System.out.println("You Win 2x Amount");
                    win = betAmount *2;
                    balance = balance +win;
                    System.out.println("Your Balance Amount is: " + balance);
                }
                else if (a==b || b==c) {
                    System.out.println("You win 1.5x Amount");
                    win = betAmount*1.5;
                    balance = win + balance;
                    System.out.println("Your Balance Amount is: " + balance);
                }
                else {
                    System.out.println("You Loss");
                    balance = balance-betAmount;
                    System.out.println("Your Balance Amount is: " + balance);
                }


                System.out.print("Do You Want To Continue This Game (Y/N): ");
                Ask = scanner.nextLine().toUpperCase();
            }

            else {
                System.out.println("Not Enough Balance in your Account.");
            }



        }

        System.out.println("Game Ended.");
        scanner.close();


    }

}
