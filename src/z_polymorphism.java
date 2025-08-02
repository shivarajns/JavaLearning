public class z_polymorphism {
    public static void main(String[] args) {

        z_polymorphism_car car = new z_polymorphism_car();
        z_polymorphism_bike bike = new z_polymorphism_bike();
        z_polymorphism_boat boat = new z_polymorphism_boat();

        // z_polymorphism_car[] cars = {car, bike, boat}; it will throw an error because bike and boat have different shapes that car
        // hence we will use a parent object as below

        z_polymorphism_vehicle[] vehicles = {car, bike, boat};

        for (z_polymorphism_vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}
