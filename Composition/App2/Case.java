
public class Case {
    private String model;
    private String menufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String menufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.menufacturer = menufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
    public void pressPoweButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getMenufacturer() {
        return menufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
