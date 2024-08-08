package week6;

public class Doctor extends Employee {
    private String specialization;

    public Doctor(String empId, String specialization) {
        super(empId);
        this.specialization = specialization;
    }

    
    public void performDuty() {
        System.out.println("Doctor " + empId + " specializes in " + specialization);
    }
}
