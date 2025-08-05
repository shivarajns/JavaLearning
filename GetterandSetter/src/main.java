public class main {
    public static void main(String[] args) {
        car Car = new car("Innova", 2015, "White");
        Car.setYear(2025);// Setter object
        Car.setColor("Black");// Setter object
        System.out.println(Car.getYear() + " " + Car.getColor()+ " " + Car.getModel()); // Getter

    }
}
