import java.util.Scanner;

public class nestedLoop_Matrix_mini_project {
    public static void main(String[] args) {
        int rows;
        int columns;
        char symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        rows=scanner.nextInt();
        System.out.print("Enter the number of Columns: ");
        columns=scanner.nextInt();
        System.out.print("Enter the Symbol: ");
        symbol=scanner.next().charAt(0);
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
            System.out.println(" ");
        }
    }
}
