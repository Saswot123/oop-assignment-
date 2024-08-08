package Assignment;

class Sphere {
    private double diameter;

    // Constructor
    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    // Getter method for diameter
    public double getDiameter() {
        return diameter;
    }

    // Setter method for diameter
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to calculate and return the volume of the sphere
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow((diameter / 2.0), 3);
    }

    // Method to calculate and return the surface area of the sphere
    public double calculateSurfaceArea() {
        return 4.0 * Math.PI * Math.pow((diameter / 2.0), 2);
    }

    // Method to return a one-line description of the sphere
    public String toString() {
        return "Sphere with diameter " + diameter;
    }
}
