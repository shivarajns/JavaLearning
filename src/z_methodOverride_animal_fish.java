public class z_methodOverride_animal_fish extends z_methodOverride_animal{

    //override method because fish cant swimming.
    @Override
    void Animal(String name) {
        System.out.println(name+" is swimming");
    }

}
