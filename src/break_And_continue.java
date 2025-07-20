public class break_And_continue {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            if(i==5){
                break;
            }
            System.out.print(i+" ");
        }

        //continue

        for(int i=0;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
