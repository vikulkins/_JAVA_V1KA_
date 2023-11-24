public class Spitz extends Dog {
    public Spitz(String dogname){
        this.dogname = dogname;
    };;
    @Override
    public String getName(){
        return "Spitz";
    };
    @Override
    public int getSize(){
        return 300;
    };
    @Override
    public String toString(){
        return "имя: " + this.dogname + " порода: " + this.getName() + " вес: " + this.getSize() + " кг";
    };
}
