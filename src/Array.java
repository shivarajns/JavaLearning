import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Banana", "Grapes", "Mango"};
        for(int i=0; i<fruits.length; i++){
            System.out.print(fruits[i]+" ");
        }
        System.out.println(" ");
        //For each loop or Enhanced for loop, for an array

        int [] Numbs = {10, 20, 70, 40, 90, 50};
        for(int Numbers : Numbs) {
            System.out.print(Numbers + " ");
        }
        System.out.println(" ");
        // sort an array
        System.out.println("Sorted array:");
        Arrays.sort(fruits);
        for(String fruit:fruits){
            System.out.print(fruit+" ");
        }
        System.out.println(" ");
        Arrays.sort(Numbs);
        for(int Numb : Numbs){
            System.out.print(Numb+" ");
        }
        System.out.println(" ");
        //Fill the array with any Elements
        System.out.println("Filling Arrays with Any elements");
        Arrays.fill(fruits, "No fruits");
        for(String fruit:fruits){
            System.out.print(fruit+" ");
        }
        System.out.println(" ");

        Arrays.fill(Numbs, 0);
        for(int Numb : Numbs){
            System.out.print(Numb+" ");
        }
    }
}
