public class InMemoryOrderRepository implements IOrderRepository {
    @Override
    public void save(String email, double amount) {
        System.out.println("Order saved for " + email + " with amount " + amount);
    }
}
