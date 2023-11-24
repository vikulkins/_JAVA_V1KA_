public class Chair extends Furniture{
    public Chair(String color){
        this.color = color;
        this.type = "chair";
    };

    @Override
    public int getPrice() {
        return 800;
    }

    @Override
    public String getType() {
        return "chair";
    }

    @Override
    public String toString() {
        return this.color + " " + this.type + " цена: " + this.getPrice();
    }
}
