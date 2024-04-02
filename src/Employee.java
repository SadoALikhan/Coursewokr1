public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private int id;
    private static int counter = 1;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName + "(id: " + id + ")";
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника: " + fullName + ". Отдел: " + department + ". Зарплата сотрудника: " + salary +
                " id: " + id;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee employee = (Employee) other;
        return fullName.equals(employee.fullName) && department == employee.department && salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(fullName);
    }
}