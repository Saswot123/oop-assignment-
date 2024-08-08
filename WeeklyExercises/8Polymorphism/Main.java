package Week7;
public class Main {
    public static void main(String[] args) {
        Firm firm = new Firm();

        // Add employees with their classifications
        firm.addEmployee(new Employee("kaushal", "Manager"));
        firm.addEmployee(new Employee("umanga", "Assistant"));
        firm.addEmployee(new Employee("himal", "Intern"));

        // Show employees and their vacation options
        firm.showEmployees();
        System.out.println("\nVacation Options:");
        for (Employee employee : firm.getEmployees()) {
            System.out.println(employee.getName() + ": " + employee.takeVacation());
        }
    }
}
