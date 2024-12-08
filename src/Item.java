abstract class Item {
    int id;
    String name;

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public abstract void displayInfo();
    public abstract void performAction();

}
