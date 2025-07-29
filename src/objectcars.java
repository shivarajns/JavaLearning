public class objectcars {

    String Company  = "Toyota ";
    String Name = "Innova Crysta";
    int Model = 2025;
    double price = 30.5;
    boolean isRunning = false;


    void Start() {
        isRunning = true;
        System.out.println("Car is Running");
    }

    void Stop() {
        isRunning = false;
        System.out.println("Car is Off");
    }

}
