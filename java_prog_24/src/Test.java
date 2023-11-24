public class Test {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(10);
        Order[] orders = new Order[10];

        for (int i = 0; i < orders.length; i++) orders[i] = new RestaurantOrder();

        orders[0].add(new Dish(499, "FISH", "заказ на рыбу"));
        orders[1].add(new Dish(259, "SET LUNCH", "для студентов"));
        orders[2].add(new Dish(99, "TEA", "?липтон, нести или рич?"));

        orderManager.add(orders[1], 1);
        System.out.println(orderManager.freeTableNumbers());

        orderManager.add(orders[2], 2);
        System.out.println(orderManager.freeTableNumbers());

        orderManager.add(orders[4],3);
        System.out.println(orderManager.freeTableNumbers());


        orderManager.add("1", orders[1]);
        System.out.println(orderManager.getOrder("1").getItems());
        System.out.println("");
        orderManager.add("2", orders[2]);
        System.out.println(orderManager.getOrder("2").getItems());

    }
}