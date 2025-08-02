public class z_interface_car implements z_interface_vehicle, z_interface_electric{
    public void start() {
        System.out.println("car is started");
    }
    public void charge(){
        System.out.println("car is Charging");
    }
}
