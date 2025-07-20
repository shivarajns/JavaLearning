public class VariableScope {
    static int x=10; //Class Variable;

    public static void main(String[] args) {
        int i =1; // Local Variable;
        System.out.println(useNum(i));
    }

    static int useNum(int a) {
        return x + a;
    }

}
