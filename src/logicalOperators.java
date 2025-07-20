import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        // && - Logical and
        // || - Logical or
        // ! - Logical Not.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age:- ");
        int age = scanner.nextInt();

        if(age>0 && age<=18){
            System.out.println("You are a minor");
        }
        else if(age>18 && age<=50){
            System.out.println("You are an youth: ");
        }
        else if(age>50 && age<200){
            System.out.println("You are an senior citizen");
        }
        else if(age == 0 || age == 1000) {
            System.out.println("Are you kidding");
        }
    }
}
