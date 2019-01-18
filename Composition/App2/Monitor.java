package Composite2;

public class Monitor {
    private String model;
    private String menufacturer;
    private int size;
    private Resulation nativeResulation;

    public Monitor(String model, String menufacturer, int size, Resulation nativeResulation) {
        this.model = model;
        this.menufacturer = menufacturer;
        this.size = size;
        this.nativeResulation = nativeResulation;
    }
    public void drawPixelAt(int x,int y,String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color );
    }

    public String getModel() {
        return model;
    }

    public String getMenufacturer() {
        return menufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resulation getNativeResulation() {
        return nativeResulation;
    }
}
