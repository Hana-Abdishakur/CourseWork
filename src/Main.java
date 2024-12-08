import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Book("The mind of the Leader", 1, "Rasmus Hougaard"));
        items.add(new Electronic("Iphone", 2, 9));
        items.add(new Book("Atomic Habits", 3, "James Clear"));
        items.add(new Electronic("Laptop", 4, 12));

        for (Item item : items) {
            item.displayInfo();
            item.performAction();
            System.out.println("");
        }
    }
}