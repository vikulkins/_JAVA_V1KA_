public class Table extends Furniture{

    public Table(String color) {
        this.color = color;
        this.type = "table";
    };

    @Override
    public int getPrice() {
        return 4000;
    }

    @Override
    public String getType() {
        return "table";
    }
    @Override
    public String toString() {
        return this.color + " " + this.type + " цена: " + this.getPrice();
    }

}
