public class Rat implements Nameable, Priceable{
    @Override
    public String getName() {
        return "rat";
    }
    @Override
    public int getPrice() {
        return 1000;
    }
}
