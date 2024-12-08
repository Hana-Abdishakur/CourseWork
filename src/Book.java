public class Book extends Item{
    private String author;

    public Book(String name, int id, String author) {
        super(name, id);
        this.author = author;
    }
    @Override
    public void displayInfo() {
        System.out.println("Book Name: " + name + ", ID: " + id + ", Author: " + author);
    }

    @Override
    public void performAction() {
        System.out.println("Reading the book '" + name + "' by " + author + ".");
    }
}
