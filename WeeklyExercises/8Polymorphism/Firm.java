package Week7;

import java.util.ArrayList;
import java.util.List;

public class Firm {
    private List<Employee> employees;

    public Firm() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - Classification: " + employee.getClassification());
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
