import java.util.Scanner;

public class StopwatchProgram {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number Countdown from: ");
        int startNum = scanner.nextInt();

        for (int i=startNum;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Stoped");
    }
}
