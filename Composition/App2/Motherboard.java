

public class Motherboard {
    private String model;
    private String menufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String menufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.menufacturer = menufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("program " + programName + " is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getMenufacturer() {
        return menufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
