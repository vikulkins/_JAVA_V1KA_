public abstract class Dish {
    public String color;
    public int price;
    public int size;
    public Dish(){};
    public abstract int getPrice();
    public abstract String dishSound();
    public abstract int getSize();
    public abstract String toString();
}
