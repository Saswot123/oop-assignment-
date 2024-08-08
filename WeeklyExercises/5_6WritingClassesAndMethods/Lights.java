package Assignment;


public class Lights {
    public static void main(String[] args) {
        // Instantiating and turning on some Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        // Turning on the bulbs
        bulb1.turnOn();
        bulb2.turnOn();

        // Checking if the bulbs are on and printing the result
        System.out.println("Bulb 1 is " + (bulb1.isOn() ? "on" : "off"));
        System.out.println("Bulb 2 is " + (bulb2.isOn() ? "on" : "off"));
        System.out.println("Bulb 3 is " + (bulb3.isOn() ? "on" : "off"));
    }
}
