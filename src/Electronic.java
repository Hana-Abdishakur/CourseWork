public class Electronic extends Item{
    private int batteryLife;

    public Electronic(String name, int id, int batteryLife) {
        super(name, id);
        this.batteryLife = batteryLife;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronic Name: " + name + ", ID: " + id + ", Battery Life: " + batteryLife + " hours");
    }

    @Override
    public void performAction() {
        if (batteryLife < 10) {
            System.out.println("Warning: Battery life is low for device '" + name + "'. Please charge soon.");
        } else {
            System.out.println("Using the electronic device '" + name + "' with a battery life of " + batteryLife + " hours.");
        }
    }
}
