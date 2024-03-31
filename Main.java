import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        LocalDate dobPerson = LocalDate.of(1990, 5, 15);
        Person person = new Person("John Doe", dobPerson);

        // Displaying person details
        person.displayName();
        person.displayAge();

        // Creating an Employee object
        LocalDate dobEmployee = LocalDate.of(1985, 10, 25);
        Employee employee = new Employee("Jane Smith", dobEmployee, 1001, 50000.0);

        // Displaying employee details
        employee.displayEmployeeDetails();
    }
}