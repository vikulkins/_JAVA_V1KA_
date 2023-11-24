public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0.1, 0.2);
        System.out.println("x координта: "+ball.getX());
        System.out.println("y координта: "+ball.getY());
        ball.setX(1.0);
        ball.setY(2.0);
        System.out.println(ball);
        ball.move(10.0,10.0);
        System.out.println(ball);
        ball.setXY(0.0,0.0);
        System.out.println(ball);
    }
}
