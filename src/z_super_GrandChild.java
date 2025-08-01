public class z_super_GrandChild extends z_super_parent {
    int salary;

    z_super_GrandChild(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    void ShowSalary() {
        System.out.println(first + "'s Salary is: " + salary+"/rs.");
    }


}
