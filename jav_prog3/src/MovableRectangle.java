public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        bottomRight = new MovablePoint(x1,y1,xSpeed,ySpeed);
        topLeft  = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public String toString(){
        return "x координата верхней левой точки: " + this.topLeft.x + " | y координата верхней левой точки: " + this.topLeft.y + " | x координата нижней правой точки: " + this.bottomRight.x + " | y координата нижней правой точки: " + this.bottomRight.y;
    }
    @Override
    public void moveUp(){
        this.bottomRight.y += bottomRight.ySpeed;
        this.topLeft.y += topLeft.ySpeed;
    }
    @Override
    public void moveDown(){
        this.bottomRight.y -= bottomRight.ySpeed;
        this.topLeft.y -= topLeft.ySpeed;
    };
    @Override
    public void moveLeft(){
        this.bottomRight.x -= bottomRight.xSpeed;
        this.topLeft.x -= topLeft.xSpeed;
    };
    @Override
    public void moveRight(){
        this.bottomRight.x += bottomRight.xSpeed;
        this.topLeft.x += topLeft.xSpeed;
    };

    public boolean speed(){
        if ((this.topLeft.xSpeed == this.bottomRight.xSpeed)&&(this.topLeft.ySpeed==this.bottomRight.ySpeed)) return true;
        else return false;
    }

}
