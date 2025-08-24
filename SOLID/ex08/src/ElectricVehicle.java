public class ElectricVehicle implements EnginePowered, ElectricPowered {
    @Override
    public void startEngine() {
        System.out.println("Scooter engine started");
    }

    @Override
    public void recharge(int kWh) {
        System.out.println("Recharged with " + kWh + " kWh");
    }
}
