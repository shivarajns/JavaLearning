public class Static {

    public static void main(String[] args) {
        staticObjects name1= new staticObjects("Dora");
        staticObjects name2=new staticObjects("Krishna");
        staticObjects name3= new staticObjects("Oggyie");

        staticObjects[] names = {name1,name2,name3};

            for (staticObjects name : names) {
                System.out.println(name.name);
            }

        staticObjects.numOfNames();
    }

}
