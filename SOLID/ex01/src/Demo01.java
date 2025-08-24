public class Demo01 {
    public static void main(String[] args) {
        ITaxCalculator taxCalculator = new TaxCalculator();
        INotificationService notificationService = new EmailClient();
        IOrderRepository orderRepository = new InMemoryOrderRepository();

        OrderService orderService = new OrderService(taxCalculator, notificationService, orderRepository);
        orderService.checkout("a@shop.com", 100.0);
    }
}
