public class TestMovable {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(10,10,1,1,5);
        MovableRectangle rectangle = new MovableRectangle(10,10,10,10,5,5);
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        
        System.out.println(rectangle);
        if (rectangle.speed()) rectangle.moveDown();
        System.out.println(rectangle);
        if (rectangle.speed()) rectangle.moveUp();
        System.out.println(rectangle);
        if (rectangle.speed()) rectangle.moveRight();
        System.out.println(rectangle);
        if (rectangle.speed()) rectangle.moveLeft();
        System.out.println(rectangle);
    }
}
