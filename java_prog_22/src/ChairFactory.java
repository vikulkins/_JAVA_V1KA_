public class ChairFactory implements AbstractChairFactory{
    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }

    @Override
    public MagicChair createMagicianChair() {
        return new MagicChair();
    }

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(1000);
    }
}