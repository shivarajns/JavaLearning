public class Methods {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int g=2;
        int k=3;

        int sum = sumoftwo(a,b);
        System.out.println(sum);

        allOfTwoNums(g,k);
    }
    static int sumoftwo(int z, int x){
        return z+x;
    }

    static void allOfTwoNums(int a, int b){
        System.out.println("sum: "+ (a+b));
        System.out.println("Sub: "+ (a-b));
        System.out.println("Mul: "+ (a*b));
        System.out.println("Square of a: " + (a*a));
        System.out.println("Square of b: " + (b*b));

    }
}
