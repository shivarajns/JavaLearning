import java.util.Random;
import java.util.Scanner;

public class DiceRoleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Dice Role: ");
        int numOfDice = scanner.nextInt();
        Random random = new Random();
        int total=0;

        if(numOfDice>0){
            for(int i=1; i<=numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                dicePrint(roll);
                System.out.println("You Rolled: "+roll);
                total = total+roll;
            }
            System.out.println("The Total Number of Dice Roll: " + total);

        }
        else {
            System.out.println("Dice cannot br Rolled 0 Times.");
        }
    }

    static void dicePrint(int roll) {
        String roll1 = """
                 ___________
                |           |
                |           |
                |     1     |
                |           |
                |           |
                 -----------
              """;
        String roll2 = """
                 ___________
                |           |
                |           |
                |     2     |
                |           |
                |           |
                 -----------
              """;
        String roll3 = """
                 ___________
                |           |
                |           |
                |     3     |
                |           |
                |           |
                 -----------
              """;
        String roll4 = """
                 ___________
                |           |
                |           |
                |     4     |
                |           |
                |           |
                 -----------
              """;
        String roll5 = """
                 ___________
                |           |
                |           |
                |     5     |
                |           |
                |           |
                 -----------
              """;
        String roll6 = """
                 ___________
                |           |
                |           |
                |     6     |
                |           |
                |           |
                 -----------
              """;

        switch(roll){
            case 1 -> System.out.println(roll1);
            case 2 -> System.out.println(roll2);
            case 3 -> System.out.println(roll3);
            case 4 -> System.out.println(roll4);
            case 5 -> System.out.println(roll5);
            case 6 -> System.out.println(roll6);
        }
    }
}
