import java.util.Scanner;

public class Quiz_Game {
    public static void main(String[] args) {

        String[] Questions = {
                "1. Which of the following is not a Java keyword?",
                "2. What is the size of an int data type in Java?",
                "3. Which method is used to start a thread in Java?",
                "4. Which of the following is not a feature of Java?",
                "5. What will be the output of the following code: int x = 10; x += 5; System.out.println(x);",
                "6. Which exception is thrown when a divided-by-zero occurs in Java?",
                "7. What is the output of this code: String str = \"Hello\"; System.out.println(str.length());",
                "8. Which of the following is a valid declaration of a char variable in Java?",
                "9. What is the default value of a boolean variable in Java?",
                "10. Which of the following loop is guaranteed to execute at least once?"
        };

        String[][] Options = {
                {"1. static", "2. Boolean", "3. void", "4. private"},
                {"1. 2 bytes", "2. 4 bytes", "3. 8 bytes", "4. Depends on the system"},
                {"1. init()", "2. run()", "3. start()", "4. execute()"},
                {"1. Platform Independent", "2. Object-Oriented", "3. Compiled only", "4. Secure"},
                {"1. 5", "2. 10", "3. 15", "4. 20"},
                {"1. IOException", "2. ArithmeticException", "3. NullPointerException", "4. IndexOutOfBoundsException"},
                {"1. 4", "2. 5", "3. 6", "4. Error"},
                {"1. char ch = \"A\";", "2. char ch = 'A';", "3. char ch = A;", "4. char ch = 65.0;"},
                {"1. true", "2. false", "3. 0", "4. null"},
                {"1. for", "2. while", "3. do-while", "4. foreach"}
        };

        int[] Answers = {2,2,3,3,3,2,2,2,2,3};

        int TotalScore = 0;


        System.out.println("*********************************************************");
        System.out.println("Java Quiz ");
        System.out.println("*********************************************************");


        for(int i=0;i<Questions.length; i++){
            System.out.println(Questions[i]);
            for(String option : Options[i]){
                System.out.println(option);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter The Option : ");
            int guessOption = scanner.nextInt();
            System.out.println("***************");
            if(guessOption==Answers[i]){
                System.out.println("Correct Answer");
                System.out.println("***************");
                TotalScore+=1;
            }
            else {
                System.out.println("Wrong Answer, Correct Answer is Option "+ Answers[i]);
                System.out.println("***************");

            }
        }

        System.out.printf("Your Totals Score is %d", TotalScore);



    }
}
