package register;

public class Employee extends User {
    private String position;
    private int salary;

    public Employee(String name, int birthYear, String address,
                    EyeColor eyeColor, String position, int salary) {
        super(name, birthYear, address, eyeColor);
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
        super("Chris John", 2010, "Fő utca 3", EyeColor.GREEN);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
