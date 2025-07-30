public class Constructors {
    public static void main(String[] args) {

//        Constructor constructor = new Constructor();
//
//        constructor.Name = "Shivaraju";
//        constructor.Age = 18;
//        constructor.Height = 5.11;
//        constructor.isStudent = true;
//
//        System.out.println(constructor.Name);
//        System.out.println(constructor.Age);
//        System.out.println(constructor.Height);

        // Using Constructor.
        Constructor constructor = new Constructor("Nagaraju", 28, 5.9);
        System.out.println(constructor.Name);
        System.out.println(constructor.Age);
        System.out.println(constructor.Height);

        Constructor cons = new Constructor("Shivaraju", 18, 5.9);
        System.out.println(cons.Name);
        System.out.println(cons.Age);
        System.out.println(cons.Height);

    }
}
