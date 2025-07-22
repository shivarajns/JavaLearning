import java.util.Scanner;

public class searchAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Numbs = {2,8,4,8,3,5,1,0};
        //if we want to search an elements in the array type of string
        // compare a target and Array index with built in equals() -> function.
        boolean isFound = false;
        int target;
        System.out.print("Enter the number you want to search: ");
        target = scanner.nextInt();
        for(int i=0; i<Numbs.length; i++) {
            if(Numbs[i] == target) {
                System.out.println("The index of searched number is: "+i);
                isFound = true;
            }
        }

        if(!isFound){
            System.out.println("The element you searched is not there in the Array");
        }

    }
}
