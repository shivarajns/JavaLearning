public class z_super_child extends z_super_parent{
    // Student info
    double GPA;

    z_super_child(String first, String last, double gpa) {
        super(first, last);
        this.GPA = gpa;
    }

    void showGpa(){
        System.out.println(first + "'s GPA is: " + GPA);
    }
}
