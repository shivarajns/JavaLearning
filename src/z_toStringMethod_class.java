public class z_toStringMethod_class {
    String name;
    int age;

    z_toStringMethod_class(String Name, int Age){
        this.name = Name;
        this.age = Age;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age + " Years old";

    }
}
