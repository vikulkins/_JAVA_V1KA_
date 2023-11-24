public class test {
    public static void main(String[] args) {
        Furniture table = new Table("blue");
        Furniture chair1 = new Chair("pink");
        Furniture chair2 = new Chair("white");
        FurnitureShop shop = new FurnitureShop();
        shop.setNumberOfChairs(2);
        shop.setNumberOfTables(1);
        System.out.println("Количество стульев: " + shop.getNumberOfChairs());
        System.out.println("Количество столов: " + shop.getNumberOfTables());
        System.out.println("Ассортимент стульев: " + chair1 + " | " + chair2);
        System.out.println("Ассортимент столов: " + table);
    }
}
