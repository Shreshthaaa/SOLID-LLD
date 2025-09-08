package beverages_decorator;

public class Client {
    public static void main(String[] args) {
        Beverage coffee = new Cappuccino();
        System.out.println("Cappuccino cost: " + coffee.cost());

        Beverage coffeeWithMilk = new Milk(new Cappuccino());
        System.out.println("Cappuccino + Milk cost: " + coffeeWithMilk.cost());

        Beverage latteWithExtras = new Sugar(new Milk(new Latte()));
        System.out.println("Latte + Milk + Sugar cost: " + latteWithExtras.cost());
    }
}
