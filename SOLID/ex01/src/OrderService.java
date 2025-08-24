public class OrderService {
    private final ITaxCalculator taxCalculator;
    private final INotificationService notificationService;
    private final IOrderRepository orderRepository;

    public OrderService(ITaxCalculator taxCalculator, INotificationService notificationService, IOrderRepository orderRepository) {
        this.taxCalculator = taxCalculator;
        this.notificationService = notificationService;
        this.orderRepository = orderRepository;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculate(subtotal);
        notificationService.send(customerEmail, "Thanks! Your total is " + total);
        orderRepository.save(customerEmail, total);
    }
}