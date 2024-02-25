public class GamingLaptop extends Laptop {
    private String graphicsCard;
    public GamingLaptop(String name, int price, String spec, String graphicsCard) {
        super(name, price, spec);
        this.graphicsCard = this.graphicsCard;
    }

    @Override
    public void bootUp() {
        System.out.println("GamingLaptop is booting up...");
    }
}