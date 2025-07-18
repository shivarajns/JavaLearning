import java.util.Scanner;
public class userInputInJava {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scnr.nextLine();

        System.out.print("Enter your age: ");
        int age = scnr.nextInt();

        System.out.print("Enter your height: ");
        double Height = scnr.nextDouble();

        System.out.println(name + " is an " + age + " year old boy " + "his height is " + Height );

        scnr.close();
    }
}
