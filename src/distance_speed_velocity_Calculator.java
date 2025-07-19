import java.util.Scanner;

public class distance_speed_velocity_Calculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Distance, Speed, Velocity Calculator");
        System.out.println("1. Calculate Distance");
        System.out.println("2. Calculate Speed");
        System.out.println("3. Calculate Velocity");
        System.out.print("Choose one options: ");
        int option = scnr.nextInt();


        if (option == 1) {
            double distance;
            double speed;
            double time;
            System.out.print("Enter the Speed (m/s): ");
            speed = scnr.nextInt();
            System.out.print("Enter the time (s): ");
            time = scnr.nextInt();
            distance = speed * time;
            System.out.printf("The total distance is %.2f meters", distance);
        } else if (option == 2) {
            double speed;
            double distance;
            double time;

            System.out.print("Enter the distance in (m/s): ");
            distance = scnr.nextDouble();
            System.out.print("Enter the time in (s): ");
            time = scnr.nextDouble();
            speed = distance / time;

            System.out.printf("The total speed is %.2f meter/second", speed);

        } else if (option == 3) {
            double velocity;
            double displacement;
            double time;

            System.out.print("Enter the Displacement in (m): ");
            displacement = scnr.nextDouble();
            System.out.print("Enter the time in (s): ");
            time = scnr.nextDouble();
            velocity = displacement / time;
            System.out.printf("The total velocity is %.2f meter/second", velocity);

        } else {
            System.out.println("Invalid selection of choice,");
        }
    }
}
