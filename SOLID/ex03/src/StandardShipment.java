public class StandardShipment extends Shipment {
    public StandardShipment(double w) {
        super(w);
    }

    @Override
    public double cost() {
        return 50 + 5 * getWeightKg();
    }
}
