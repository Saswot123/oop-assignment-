package week6;

public class Receptionist extends Employee {
    public Receptionist(String empId) {
        super(empId);
    }

    
    public void performDuty() {
        System.out.println("Receptionist " + empId + " is assisting patients at the front desk");
    }
}
