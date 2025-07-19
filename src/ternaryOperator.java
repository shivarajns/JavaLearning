import java.util.Scanner;

public class ternaryOperator {

    /*an alternative of if else statement

    ternary operator?True : false ;

    variable = (ternary operator)?True:False;
     */

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        int marks = scnr.nextInt();

        String passOrFail = (marks >= 35)?"Pass":"Fail";

        System.out.println(passOrFail);
    }
}
