public abstract class Shipment {
    private final double weightKg;

    public Shipment(double w) {
        this.weightKg = w;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public abstract double cost();
}