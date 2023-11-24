public class Retriever extends Dog {
    public Retriever(String dogname){
        this.dogname = dogname;
    };;
    @Override
    public String getName(){
        return "Retriever";
    };
    @Override
    public int getSize(){
        return 1000;
    };
    public String toString(){
        return"имя: " + this.dogname + " порода: " + this.getName() + " вес: " + this.getSize() + " кг";
    };
}
