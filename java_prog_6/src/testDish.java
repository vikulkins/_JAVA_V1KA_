public class testDish {
    public static void main(String[] args) {
        Dish plate = new Plate();
        Dish cup = new Cup();
        System.out.println(plate.toString());
        System.out.println("звук посуды: " + plate.dishSound());
        System.out.println(cup.toString());
        System.out.println("звук посуды: " + cup.dishSound());
    }
}
