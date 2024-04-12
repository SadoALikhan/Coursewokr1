public class Main {
    public static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.toString());
        }
    }

    public static double calculateSum() {
        double totalEmployeeSum = 0;
        for (int i = 0; i < employees.length; i++) {
            totalEmployeeSum += employees[i].getSalary();
        }
        return totalEmployeeSum;
    }

    public static void minSalary() {
        Employee minSalary =  employees[0];
        for ( Employee salary : employees) {
            if (salary.getSalary() < minSalary.getSalary()) {
                minSalary = salary;
            }
        }
        System.out.println("Сотрудник с мнимальной ЗП: " + minSalary);
    }

    public static void maxSalary() {
        Employee  maxSalary = employees[0];
        for (Employee salary: employees) {
            if (salary.getSalary() > maxSalary.getSalary()) {
                maxSalary = salary;
            }
        }
        System.out.println("Сотрудник с максимальной ЗП: " + maxSalary);
    }

    public static void averageSalary() {
        double averageSalary = 0.0;
        for (double i = 0; i < employees.length; i++) {
        }
        averageSalary = (double) calculateSum() / employees.length;
        System.out.println("Среднее значение ЗП: " + averageSalary);
    }

    public static void employeesFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 2, 50_000);
        employees[1] = new Employee("Леонов Никита Николаевич", 3, 45_000);
        employees[2] = new Employee("Степанов Алексей Иванович", 1, 60_000);
        employees[3] = new Employee("Семёнов Ярослав Филиппович", 3, 55_000);
        employees[4] = new Employee("Максимов Николая Владимирович", 4, 49_000);
        employees[5] = new Employee("Степанов Ермак Артемович", 1, 62_000);
        employees[6] = new Employee("Морозов Василий Михаилович", 5, 59_000);
        employees[7] = new Employee("Михайлов Артур Евсеевич", 2, 44_000);
        employees[8] = new Employee("Кешелев Константин Кириллович", 4, 63_000);
        employees[9] = new Employee("Тихонов Вадим Игоревич", 5, 53_000);
        System.out.println("Задача 8.a: ");
        printEmployees();
        System.out.println("Задача 8.b: ");
        System.out.println("Сумму затрат на ЗП в месяц: " + calculateSum());
        System.out.println("Задача 8.c:");
        minSalary();
        System.out.println("Задача 8.d:");
        maxSalary();
        System.out.println("Задача 8.e");
        averageSalary();
        System.out.println("Задача 8.f");
        employeesFullName();
    }
}