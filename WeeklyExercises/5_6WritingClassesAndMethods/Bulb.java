package Assignment;
class Bulb {
    private boolean isOn; // Represents the state of the bulb (on/off)

    // Constructor to initialize the bulb as off by default
    public Bulb() {
        this.isOn = false;
    }

    // Method to turn the bulb on
    public void turnOn() {
        this.isOn = true;
    }

    // Method to turn the bulb off
    public void turnOff() {
        this.isOn = false;
    }

    // Method to check if the bulb is on
    public boolean isOn() {
        return isOn;
    }
}