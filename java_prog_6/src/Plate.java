public class Plate extends Dish {
    public Plate(){
        this.color = "red";
    }
    @Override
    public int getPrice() {
        return 80;
    }
    @Override
    public String dishSound() {
        return "Вау Вау Вау Йупи Йо Йупи Йей";
    }
    @Override
    public int getSize() {
        return 100;
    }

    @Override
    public String toString(){
        return "тарелка! " + "цвет: " + this.color + " размер: " + this.getSize() + " цена: " + this.getPrice();
    }
}
