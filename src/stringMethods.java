import java.util.Scanner;
public class stringMethods {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scnr.nextLine(); //taking the name of the user.
        int length = name.length(); // finding length of the username.
        System.out.printf("Letters in your name is: %d\n",length);

        // finding character at a nth index
        System.out.print("Enter the index of the character you want in your name: ");
        int Charindex = scnr.nextInt(); // take an index value as an input
        char character = name.charAt(Charindex);
        System.out.printf("The Character at the index %d is (%c)\n",Charindex, character); // print a nth index character
        scnr.nextLine();

        //finding an index of the character
        System.out.print("Enter the need index of character (eg: a or s or z): ");
        String ch=scnr.nextLine();
        int indxOfChar = name.indexOf(ch);
        System.out.printf("The index of the character is %d\n",indxOfChar);

        //Converting to UpperCase and LowerCase

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


    }
}
