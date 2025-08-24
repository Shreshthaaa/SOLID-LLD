public class PaymentViaUpi implements PaymentProvider {
    @Override
    public String processPayment(Payment payment) {
        return "Paid via UPI: " + payment.amount;
    }
}
