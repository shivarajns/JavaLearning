import java.util.Scanner;

public class userInputForAnArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] foods;

        System.out.print("Enter the Size of an Array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the Food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food:foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
