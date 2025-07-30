public class OverloadedConstructor {
    public static void main(String[] args) {
        System.out.println("Constructor with 1 parameter");
        OverloadedConstructors constructor = new OverloadedConstructors("Shivaraju");
        System.out.println(constructor.Name);
        System.out.println(constructor.Age);
        System.out.println(constructor.Height);

        System.out.println(" ");
        System.out.println("Constructor with 2 parameter");
        OverloadedConstructors constructor2 = new OverloadedConstructors("Shivaraju", 21);
        System.out.println(constructor2.Name);
        System.out.println(constructor2.Age);
        System.out.println(constructor2.Height);
        System.out.println(" ");

        System.out.println("Constructor with 3 parameter");
        OverloadedConstructors constructor3 = new OverloadedConstructors("Shivaraju", 21, 5.11);
        System.out.println(constructor3.Name);
        System.out.println(constructor3.Age);
        System.out.println(constructor3.Height);
    }
}
