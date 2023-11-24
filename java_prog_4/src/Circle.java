public class Circle {
    public double radius, diameter, length, square, x_centre, y_centre;
    public Circle(double radius, double x_centre, double y_centre){
        this.radius = radius;
        this.x_centre = x_centre;
        this.y_centre = y_centre;
        this.diameter = 2 * radius;
        this.length = 2 * 3.14 * radius;
        this.square = 3.14 * radius * radius;
    }
    public void up(double y){
        this.y_centre = this.y_centre + y;
    }
    public void down(double y){
        this.y_centre = this.y_centre - y;
    }
    public void right(double x){
        this.x_centre = this.x_centre + x;
    }
    public void left(double x){
        this.x_centre = this.x_centre - x;
    }
    public String toString(){
        return "радиус: " + this.radius + " диаметр: " + this.diameter + " длина: " + this.length + " площадь: " + this.square;
    }
    public String getCoordinates(){
        return "координаты центра (" + this.x_centre + "," + this.y_centre + ")";
    }
}
