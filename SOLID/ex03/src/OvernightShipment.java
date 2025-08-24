public class OvernightShipment extends Shipment {
    public OvernightShipment(double w) {
        super(w);
    }

    @Override
    public double cost() {
        return 120 + 10 * getWeightKg();
    }    
}
