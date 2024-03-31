import java.time.LocalDate;

// Person class
class Person {
    String name;
    LocalDate dob;

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - dob.getYear();
        System.out.println("Age: " + age);
    }
}

// Employee class inheriting from Person
class Employee extends Person {
    int empId;
    double salary;

    public Employee(String name, LocalDate dob, int empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}