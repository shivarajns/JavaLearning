public class OverloadedConstructors {

    String Name;
    int Age;
    double Height;


    OverloadedConstructors (String name) {
        this.Name=name;
        this.Age=0;
        this.Height = 0;
    }
    OverloadedConstructors (String name, int age) {
        this.Name=name;
        this.Age=age;
        this.Height = 0;
    }
    OverloadedConstructors (String name, int age, double height) {
        this.Name=name;
        this.Age=age;
        this.Height = height;
    }
}
