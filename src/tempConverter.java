import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the Temperature: ");
        double temp = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the unit (C or F): ");
        String unit = scanner.nextLine().toUpperCase();

        switch (unit) {
            case "C" -> {
                double f;

                f=(temp*((double) 9/5))+32;
                System.out.printf("The temperature in fahrenheit is %.1f°F.",f);
            }
            case "F" -> {
                double c;

                c= (temp - 32)*((double)5/9);
                System.out.printf("The temperature in Celsius is %.1f°C.",c);

            }

            default -> System.out.println("Invalid input!.");
        }
    }
}
