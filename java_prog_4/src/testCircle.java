public class testCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4,1,1);
        System.out.println(circle.toString());
        System.out.println(circle.getCoordinates());
        circle.left(5);
        circle.up(5);
        System.out.println(circle.getCoordinates());
        circle.down(5);
        circle.right(5);
        System.out.println(circle.getCoordinates());
    }
}