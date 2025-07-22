public class TwoD_Array {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Grapes"};
        String[] vegetables = {"Carrot", "Onion", "Tomato"};
        String[] meats = {"Chicken", "Mutton", "Fish"};

        String [][] foods = {fruits, vegetables, meats};

        for(String[] food: foods){
            for(String items:food){
                System.out.print(items + " ");
            }
            System.out.println(" ");
        }

        // Or we can also insert items for a 2D Array like:

        int [][] Numbs = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}};
        for (int[] Numb : Numbs) {
            for ( int numb : Numb) {
                System.out.print(numb);
            }
            System.out.println(" ");
        }

        //Insert Some Element to a 2D Array.
        String [][] foodss = {{"Apple", "Orange", "Grapes"},
                            {"Carrot", "Onion", "Tomato"},
                            {"Chicken", "Mutton", "Fish"}};

        foodss[0][0] = "Banana";               // 1st - [] will be the Row and 2nd - [] will be the column Number.
        foodss[1][2] = "Beans";
        foodss[2][1] = "Pork";

        for(String[] food: foodss){
            for(String items:food){
                System.out.print(items + " ");
            }
            System.out.println(" ");
        }

    }
}
