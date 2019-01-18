
public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20 ,20 ,5 );
        Case theCase =  new Case("2200","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inc","Acer ",27 ,new Resulation(2540,2000));
        Motherboard motherboard = new Motherboard("B3-2500","Asus",4,6, "v2.44");

        PC thePC = new PC(theCase,theMonitor,motherboard);

        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("Ubuntu 1.0");
        thePC.getTheCase().pressPoweButton();
    }



}
