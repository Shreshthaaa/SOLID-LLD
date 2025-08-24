public class PaymentViaCard implements PaymentProvider {
    @Override
    public String processPayment(Payment payment) {
        return "Charged card: " + payment.amount;
    }
}
