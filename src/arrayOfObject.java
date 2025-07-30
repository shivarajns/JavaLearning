public class arrayOfObject {
    public static void main(String[] args) {
        arrayOfObjectClass cons1 = new arrayOfObjectClass("Innova", "White");
        arrayOfObjectClass cons2 = new arrayOfObjectClass("Benz", "red");

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
    }
}
