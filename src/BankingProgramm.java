import java.util.Scanner;

public class BankingProgramm {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt=0;
        double balance=0;
        while (opt != 4){
        System.out.println("******************************");
        System.out.println("1.Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
            System.out.println("******************************");
        System.out.print("Choose an option (1-4): ");
        opt = scanner.nextInt();

        switch (opt){
            case 1 ->{
                System.out.printf("Balance amount in your account is %.2f/-Rs only\n",balance);
            }
            case 2->{
                System.out.print("Enter the Deposit Amount in Rs: ");
                double depAmo = scanner.nextDouble();
                balance = deposit(balance, depAmo);
            }
            case 3->{
                System.out.print("Enter the Amount you have to withdraw in Rs: ");
                double withDrawAmo = scanner.nextDouble();
                if(balance>withDrawAmo) {
                balance = withdraw(balance, withDrawAmo);
                }
                else {
                    System.out.println("You don't have Enough Money in your account To withdraw");
                }
            }
            case 4 ->{
                System.out.println("Exited");
            }
            default -> {
                System.out.println("Choose the valid Option");
            }
        }
        }



    }

    static double deposit(double balance, double depamount) {
        return balance + depamount;
    }
    static double withdraw(double balance, double withdrawamo){
        return balance - withdrawamo;
    }
}
