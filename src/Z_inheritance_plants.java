public class Z_inheritance_plants extends Z_inheritance_organism  {

    boolean isPhotosynthes;

    Z_inheritance_plants() {
        isPhotosynthes=true;
    }

    static void plantFood() {
        System.out.println("plant uses sunlight to prepare its food");
    }
}
