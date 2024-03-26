package pizza;

public class PizzaDeal {

    public double deal(Pizza pizza) {
        double discount = pizza.getShape().getArea();
        return pizza.getPrice()/discount;
    }

    public boolean betterDeal(Pizza p1, Pizza p2) {
        return deal(p1) < deal(p2);
    }

    public double getPizzaDeal(Pizza pizza) {
        double discount = pizza.getShape().getArea();
        return pizza.getPrice()/discount;
    }
}
