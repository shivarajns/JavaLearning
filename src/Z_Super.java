public class Z_Super {
    public static void main(String[] args) {

        z_super_child studentGpa = new z_super_child ("harry", "potter", 8.5);
        z_super_GrandChild salary =new z_super_GrandChild("Tom", "Ridder", 95000);

        studentGpa.showGpa();
        salary.ShowSalary();
    }
}
