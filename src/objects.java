public class objects {
    public static void main (String[] args){

        objectcars car = new objectcars();

        System.out.println(car.Company);
        System.out.println(car.Name);
        System.out.println(car.Model);
        System.out.println(car.price);
        System.out.println(car.isRunning);


        car.Start();
        car.Stop();

    }

}
