import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter Your Full Name: ");
        String Name = scr.nextLine();

        System.out.print("Enter your Age: ");
        int Age = scr.nextInt();

        System.out.print("Enter Your Height: ");
        double Height = scr.nextDouble();


        System.out.println(Name + " is an " + Age + " year old boy and his height is " + Height);
    }
}
