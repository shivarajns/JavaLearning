import java.util.Scanner;

public class printf {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter Your Full Name: ");
        String Name = scr.nextLine();

        System.out.print("Enter your Age: ");
        int Age = scr.nextInt();

        System.out.print("Enter Your Height: ");
        double Height = scr.nextDouble();

        System.out.printf("%s is an %d years old boy and he is %.2f feet tall", Name, Age, Height);
    }
}
