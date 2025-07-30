public class arrayOfObjectClass {
    String brand;
    String color;

    arrayOfObjectClass(String Brand, String Color) {
        this.brand = Brand;
        this.color = Color;
    }

     void drive() {
        System.out.println("You Drive " + this.color + " " + this.brand);
    }

}
