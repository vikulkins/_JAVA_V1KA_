public abstract class Furniture {
    public String type;
    public int price;
    public String color;
    public Furniture(){};
    public abstract int getPrice();
    public abstract String getType();
    public abstract String toString();
}
