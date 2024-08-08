package Assignment;


public class MultiSphere {
    public static void main(String[] args) {
        // Instantiating and updating several Sphere objects
        Sphere sphere1 = new Sphere(5.0);
        Sphere sphere2 = new Sphere(10.0);

        // Printing initial information
        System.out.println("Initial Information:");
        System.out.println(sphere1);
        System.out.println("Volume: " + sphere1.calculateVolume());
        System.out.println("Surface Area: " + sphere1.calculateSurfaceArea());
        System.out.println();

        System.out.println(sphere2);
        System.out.println("Volume: " + sphere2.calculateVolume());
        System.out.println("Surface Area: " + sphere2.calculateSurfaceArea());
        System.out.println();

        // Updating sphere1 diameter
        sphere1.setDiameter(7.0);

        // Printing updated information
        System.out.println("Updated Information:");
        System.out.println(sphere1);
        System.out.println("Volume: " + sphere1.calculateVolume());
        System.out.println("Surface Area: " + sphere1.calculateSurfaceArea());
    }
}

