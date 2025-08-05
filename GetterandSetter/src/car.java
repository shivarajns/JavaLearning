public class car {
    private String Model;
    private int Year;
    private String Color;


    car(String model, int year, String color){
        this.Model = model;
        this.Year = year;
        this.Color = color;
    }
    // To print the parameters of private data type:
    String getModel() {
        return this.Model;
    }

    int getYear() {
        return this.Year;
    }

    String getColor() {
        return this.Color;
    }
    // To set the parameter of private data type:
    void setYear(int year){
        this.Year = year;
    }
    void setColor(String colo){
        this.Color = colo;
    }
}
