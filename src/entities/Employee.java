package entities;
import java.text.DecimalFormat;

public class Employee {
    private int id;
    private String name;
    private Double salary;
    
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }
    
    public void increaseSalary(double increase){
        double ic = increase /100;
        salary += salary * ic;
    }
   
    @Override
    public String toString(){
        String formatedSalary = new DecimalFormat("#00.00").format(salary);
        return id + ", " + name + ", " + formatedSalary;
    }
}
