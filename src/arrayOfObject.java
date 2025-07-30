public class arrayOfObject {
    public static void main(String[] args) {
        arrayOfObjectClass cons1 = new arrayOfObjectClass("Innova", "White");
        arrayOfObjectClass cons2 = new arrayOfObjectClass("Benz", "Red");

        arrayOfObjectClass [ ] cars = {cons1, cons2};
        for(int i=0; i<cars.length; i++) {
            cars[i].drive();
        }

        // Using Enhanced for loop
        System.out.println("********************************");
        System.out.println("Using Enhanced For Loop");
        for (arrayOfObjectClass car :cars){
            car.drive();

        }
        System.out.println("******************************");
        arrayOfObjectClass[] cars1 = { new arrayOfObjectClass("Swift", "blue"),
                                       new arrayOfObjectClass("Nexon", "black")};

        for (arrayOfObjectClass car : cars1) {
            car.drive();
        }
        System.out.println("******************************");
        for (arrayOfObjectClass car : cars1) {
            car.color = "pink";
        }
        for (arrayOfObjectClass car : cars1) {
            car.drive();
        }
    }
}
