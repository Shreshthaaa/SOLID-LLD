public class PaymentViaWallet implements PaymentProvider {
    @Override
    public String processPayment(Payment payment) {
        return "Wallet debit: " + payment.amount;
    }
}
