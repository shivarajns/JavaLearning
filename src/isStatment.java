import java.util.Scanner;
public class isStatment {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        System.out.print("Enter Your age: ");
        int Age = src.nextInt();

        if(Age == 0) {
            System.out.println("Are You kidding?");
        }
        else if(Age<=18) {
            System.out.println("You can't drive, You have to waite for " + (18-Age) + " Year");
        }
        else {
            System.out.println("You can drive");
        }

    }

}
