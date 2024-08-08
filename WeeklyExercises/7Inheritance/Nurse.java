package week6;

public class Nurse extends Employee {
    public Nurse(String empId) {
        super(empId);
    }

    @Override
    public void performDuty() {
        System.out.println("Nurse " + empId + " has patients");
    }
}
