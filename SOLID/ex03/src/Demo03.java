public class Demo03 {
    public static void main(String[] args) {
        Shipment s = new ExpressShipment(2.0);
        System.out.println(s.cost());
    }
}
