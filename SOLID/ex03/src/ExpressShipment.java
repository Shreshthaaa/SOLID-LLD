public class ExpressShipment extends Shipment {
    public ExpressShipment(double w) {
        super(w);
    }

    @Override
    public double cost() {
        return 80 + 8 * getWeightKg();
    }    
}
