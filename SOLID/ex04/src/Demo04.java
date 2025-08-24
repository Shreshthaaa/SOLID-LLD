public class Demo04 {
    public static void main(String[] args) {
        Payment payment = new Payment("UPI", 499);
        PaymentProvider provider = new PaymentViaUpi();
        System.out.println(provider.processPayment(payment));
    }
}
