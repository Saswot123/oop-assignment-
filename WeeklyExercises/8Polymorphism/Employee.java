package Week7;

import java.util.HashMap;

public class Employee {
    private String name;
    private String classification;

    public Employee(String name, String classification) {
        this.name = name;
        this.classification = classification;
    }

    public String takeVacation() {
        HashMap<String, String> vacationOptions = new HashMap<>();
        vacationOptions.put("Manager", "Two weeks paid vacation");
        vacationOptions.put("Assistant", "One week paid vacation");
        vacationOptions.put("Intern", "No vacation");

        return vacationOptions.getOrDefault(classification, "Unknown classification");
    }

    public String getName() {
        return name;
    }

    public String getClassification() {
        return classification;
    }
}
