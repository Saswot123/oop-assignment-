package Assignment;

class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyrightDate;

    // Constructor to accept and initialize title, author, publisher, and copyright date
    public Book(String title, String author, String publisher, int copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    // Getter methods for title, author, publisher, and copyright date
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCopyrightDate() {
        return copyrightDate;
    }

    // Setter methods for title, author, publisher, and copyright date
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCopyrightDate(int copyrightDate) {
        this. copyrightDate = copyrightDate;
    }

    // Method to return a nicely formatted multiline description of the book
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher +
                "\nCopyright Date: " + copyrightDate;
    }
}
