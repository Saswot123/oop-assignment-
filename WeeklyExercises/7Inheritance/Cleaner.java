package week6;
public class Cleaner extends Employee {
    public Cleaner(String empId) {
        super(empId);
    }

   
    public void performDuty() {
        System.out.println("Cleaner " + empId + " is sweeping");
    }
}

