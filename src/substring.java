import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter your mail: ");
        String email = scnr.nextLine();

        if (email.contains("@")){
            String name = email.substring(0, email.indexOf("@"));
            String domain=email.substring((email.indexOf("@")+1));

            System.out.println("Your name is: " + name);
            System.out.println("Your domain is: "+domain);
        }
        else{
            System.out.println("Invalid email, enter correct mail eg: yourname@email.com");
        }



        scnr.close();
    }
}
