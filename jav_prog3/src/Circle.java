public class Circle extends Shape {
    protected double radius;
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    };
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    };

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius*radius*3.14;
    }
    @Override
    public double getPerimeter(){
        return 2*radius*3.14;
    }
    @Override
    public String toString() {
        return "цвет: " + this.color + " filled: " + this.filled + " радиус: " + this.radius;
    }
}
