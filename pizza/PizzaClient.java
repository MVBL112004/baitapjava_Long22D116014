package pizza;

public class PizzaClient {

    public static void main(String[] args) {

        // Tạo các pizza
        Pizza pizza1 = new Pizza(100, new Circle(5));
        Pizza pizza2 = new Pizza(120, new Rectangle(6, 8));

        // In thông tin pizza
        System.out.println("Pizza 1:");
        System.out.println(pizza1);
        System.out.println("Diện tích: " + pizza1.getShape().getArea());

        System.out.println("\nPizza 2:");
        System.out.println(pizza2);
        System.out.println("Diện tích: " + pizza2.getShape().getArea());

        // Tính giá giảm giá
        PizzaDeal deal = new PizzaDeal();
        double price1 = deal.getPizzaDeal(pizza1);
        double price2 = deal.getPizzaDeal(pizza2);

        // In giá giảm giá
        System.out.println("\nGiá giảm giá:");
        System.out.println("Pizza 1: " + price1);
        System.out.println("Pizza 2: " + price2);

        // So sánh giá giảm giá
        if (deal.betterDeal(pizza1, pizza2)) {
            System.out.println("\nPizza 1 có giá tốt hơn");
        } else {
            System.out.println("\nPizza 2 có giá tốt hơn");
        }

    }

}
