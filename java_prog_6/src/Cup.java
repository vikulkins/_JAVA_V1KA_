public class Cup extends Dish{
    public Cup(){
        this.color = "blue";
    }
    @Override
    public int getPrice() {
        return 55;
    }
    @Override
    public String dishSound() {
        return "манера крутит мир";
    }
    @Override
    public int getSize() {
        return 40;
    }
    @Override
    public String toString(){
        return "чашка! " + "цвет: " + this.color + " размер: " + this.getSize() + " цена: " + this.getPrice();
    }
}
