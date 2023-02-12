public class Employee {

    private static int counterId = 1;
    private final int id;
    private final String lastName;
    private final String firstName;
    private int department;
    private int salary;

    public Employee(String lastName,
                    String firstName,
                    int department,
                    int salary) {
        this.id = counterId++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format(
                "id: %d, ФИО: %s %s, № отдела: %d, зарплата :%d",
                id,
                lastName,
                firstName,
                department,
                salary
                );
    }
}
