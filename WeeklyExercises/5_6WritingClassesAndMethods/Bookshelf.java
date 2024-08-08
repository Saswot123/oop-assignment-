package Assignment;

public class Bookshelf {
    public static void main(String[] args) {
        // Instantiating and updating several Book objects
        Book book1 = new Book("Java Programming", "John Doe", "ABC Publications", 2020);
        Book book2 = new Book("Python Programming", "Jane Smith", "XYZ Books", 2019);

        // Printing initial information
        System.out.println("Initial Information:");
        System.out.println(book1);
        System.out.println();

        System.out.println(book2);
        System.out.println();

        // Updating book1 information
        book1.setTitle("Advanced Java Programming");
        book1.setPublisher("DEF Publications");

        // Printing updated information
        System.out.println("Updated Information:");
        System.out.println(book1);
    }
}


