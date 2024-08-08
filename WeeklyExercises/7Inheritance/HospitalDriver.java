package week6;
public class HospitalDriver {
    public void testEmployees() {
        Doctor doctor = new Doctor("D21", "psychology");
        Nurse nurse = new Nurse("N12");
        Receptionist receptionist = new Receptionist("R12");
        Cleaner cleaner = new Cleaner("C01");

        Employee[] employees = {doctor, nurse, receptionist, cleaner};

        for (Employee employee : employees) {
            employee.performDuty();
        }
    }

    public static void main(String[] args) {
        HospitalDriver driver = new HospitalDriver();
        driver.testEmployees();
    }
}
