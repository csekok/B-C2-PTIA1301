package register;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    //TODO Before doing a task remove "/*" and "*/" in its test class (Shortcut: Ctrl + Shift + /).

    private static final String name = "Johnny Bravo";
    private static final String address = "Baker Street";
    private static final String position = "Manual Tester";
    private static final int birthYear = 2000;
    private static final int salary = 400_000;

    /*
    @Test
    public void testConstructor() {
        Employee employee = new Employee(name, birthYear, address, EyeColor.BLUE, position, salary);

        assertEquals(name, employee.getName());
        assertEquals(birthYear, employee.getBirthYear());
        assertEquals(address, employee.getAddress());
        assertEquals(EyeColor.BLUE, employee.getEyeColor());
        assertEquals(position, employee.getPosition());
        assertEquals(salary, employee.getSalary());
    }

    @Test
    public void testSetName() {
        String name = "John Doe";

        Employee employee = new Employee(name, birthYear, address, EyeColor.BLUE, position, salary);

        employee.setName(name);
        assertEquals(name, employee.getName());
    }

    @Test
    public void testSetBirthYear() {
        int birthYear = 1984;

        Employee employee = new Employee(name, birthYear, address, EyeColor.BLUE, position, salary);

        employee.setBirthYear(birthYear);
        assertEquals(birthYear, employee.getBirthYear());
    }

    @Test
    public void testSetAddress() {
        String address = "Baker Street 221B";

        Employee employee = new Employee(name, birthYear, address, EyeColor.BLUE, position, salary);

        employee.setAddress(address);
        assertEquals(address, employee.getAddress());
    }

    @Test
    public void testAgeIn() {
        int expectedAge = 34;
        int year = birthYear + expectedAge;

        Employee employee = new Employee(name, birthYear, address, EyeColor.BLUE, position, salary);

        employee.setBirthYear(birthYear);
        assertEquals(expectedAge, employee.ageIn(year));
    }

    @Test
    public void testSetPosition() {
        String position = "Automation Tester";

        Employee employee = new Employee(name, birthYear, address, EyeColor.BLUE, position, salary);

        employee.setPosition(position);
        assertEquals(position, employee.getPosition());
    }

    @Test
    public void testSetSalary() {
        int salary = 440_000;

        Employee employee = new Employee(name, birthYear, address, EyeColor.BLUE, position, salary);

        employee.setSalary(salary);
        assertEquals(salary, employee.getSalary());
    }
    */
}
