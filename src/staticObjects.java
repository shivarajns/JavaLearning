public class staticObjects {

    String name;
    static int Numofnames;


    staticObjects(String name) {
        this.name = name;
        Numofnames++;
    }

    static  void numOfNames() {
        System.out.println("You have "+Numofnames + " total friends");
    }

}
