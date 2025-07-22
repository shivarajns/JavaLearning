public class varargs {
    public static void main(String[] args) {

        System.out.println("Sum of numbers: "+add(1, 2, 3, 4));
        System.out.println("Average of numbers: "+average(1, 2, 3, 4));
    }
    static int add( int ... numbers) {
        int sum = 0;

        for(int number: numbers){
            sum = sum+number;
        }

        return sum;
    }

    static double average(double... averNumbs) {
        double sum=0;
        for(double numbers : averNumbs) {
            sum = sum + numbers;
        }
        return (sum/averNumbs.length);
    }
}
