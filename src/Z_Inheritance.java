public class Z_Inheritance {
    public static void main(String[] args) {

        Z_inheritance_organism org = new Z_inheritance_organism();
        Z_inheritance_plants plants = new Z_inheritance_plants();
        Z_inheritance_Animals Animals = new Z_inheritance_Animals();
        Z_inheritance_Lion lion = new Z_inheritance_Lion();
        Z_inheritance_Deer deer = new Z_inheritance_Deer();

        System.out.println(org.isAlive);
        System.out.println(plants.isAlive);
        System.out.println(Animals.isAlive);
        System.out.println(lion.isAlive);
        System.out.println(deer.isAlive);

        // food

        Z_inheritance_plants.plantFood(); // calling method in plant class
        System.out.println(Animals.food); // calling an object in an Animal
        Z_inheritance_Lion.lion();// calling method in plant class
        Z_inheritance_Deer.deer();// calling method in plant class

    }
}
