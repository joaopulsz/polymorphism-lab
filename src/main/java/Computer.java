public class Computer extends ElectronicDevice {

    private String operatingSystem;
    private String chip;
    private int memory;
    private int storage;

    public Computer(String brand, double price, String operatingSystem, String chip, int memory, int storage) {

        super(brand, price);
        this.operatingSystem = operatingSystem;
        this.chip = chip;
        this.memory = memory;
        this.storage = storage;
    }

    public String browseInternet() {
        return "Enter an url or search Google.";
    }

    public String checkEmails() {
        return "No new email.";
    }

    public String writeCode() {
        return "Creating new Java project.";
    }

    public String editText() {
        return "Type here.";
    }

    public String createSpreadsheet() {
        return "Type here.";
    }
}
