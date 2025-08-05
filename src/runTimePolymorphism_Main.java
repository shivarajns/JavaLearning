import java.util.Scanner;

public class runTimePolymorphism_Main {
    public static void main(String[] args) {

        runTimePolymorphism_Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Favourite Animal (Dog=1 / Cat=2): ");
        int choose = scanner.nextInt();


        if(choose==1){
            animal = new runTimePolymorphism_Dog();
            animal.Speak();
        }
        else if (choose==2){
            animal = new runTimePolymorphism_cat();
            animal.Speak();
        }
    }
}
