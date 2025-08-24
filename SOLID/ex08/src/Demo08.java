public class Demo08 {
    public static void main(String[] args) {
        Pedalable bike = new Bicycle();
        bike.pedal(5);

        EnginePowered car = new Car();
        car.startEngine();

        ElectricVehicle scooter = new ElectricVehicle();
        scooter.startEngine();
        scooter.recharge(10);
    }
}
