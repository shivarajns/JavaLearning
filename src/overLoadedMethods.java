public class overLoadedMethods {
    public static void main(String[] args) {
        String area1 = "Lion";
        System.out.println(animals(area1));

        String area2 = "Tiger";
        System.out.println(animals(area1, area2));

        String area3 = "Bear";
        System.out.println(animals(area1, area2, area3));
    }
    static String animals(String a){
        return ("Area 1 Has only " + a) ;
    }
    // has the same name as above (animals) but there are two parameters a and b -----

    static String animals(String a, String b){
        return ("Area 2 Has " + a +" "+b) ;
    }
    // has the same name as above (animals) but there are two parameters a, b and c -----

    static String animals(String a, String b, String c){
        return ("Area 3 Has " + a +" "+b+ " "+ c) ;
    }

}
