public class RestarauntTest {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager(10);
        Order[] orders = new Order[10];

        for (int i = 0; i < orders.length; i++) orders[i] = new Order();

        orders[0].add(new Dish(499, "FISH", "заказ на рыбу"));
        orders[1].add(new Dish(259, "SET LUNCH", "для студентов"));
        orders[2].add(new Dish(99, "TEA", "?липтон, нести или рич?"));

        orderManager.add(orders[0], 3);
        System.out.println(orderManager.ordersCostSummary());

        orderManager.add(orders[1], 4);
        System.out.println(orderManager.ordersCostSummary());
        System.out.println(orderManager.freeTableNumbers());

        orderManager.removeOrder(3);
        System.out.println(orderManager.ordersCostSummary());
        System.out.println(orderManager.freeTableNumbers());

        orderManager.add(orders[2], 3);
        System.out.println(orderManager.ordersCostSummary());

        System.out.println(orderManager.freeTableNumbers());
    }
}