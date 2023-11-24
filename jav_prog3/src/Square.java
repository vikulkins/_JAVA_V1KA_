public class Square extends Rectangle{
    Square(){};
    Square(double side){
        this.width = side;
        this.length = side;
    };
    Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    };

    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString(){
        return "сторона: " + this.width;
    }

}
