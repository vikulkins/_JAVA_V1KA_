public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Book book = new Book();
        Rat rat = new Rat();
        System.out.println("имя: " + rat.getName() + " price: " + rat.getPrice());
        System.out.println("имя: " + car.getName());
        System.out.println("цена: " + book.getPrice());
    }
}