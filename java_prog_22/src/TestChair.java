public class TestChair {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();

        Chair magicChair = factory.createMagicianChair();
        Chair victorianChair = factory.createVictorianChair();
        Chair functionalChair = factory.createFunctionalChair();

        ((MagicChair)magicChair).doMagic();
        System.out.println("age: " + ((VictorianChair)victorianChair).getAge());
        System.out.println("functional: " + ((FunctionalChair)functionalChair).sum(99,1));

        Client client = new Client();
        client.setChair(victorianChair);
        client.sit();
    }
}