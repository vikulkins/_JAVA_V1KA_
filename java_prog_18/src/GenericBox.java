
import java.io.Serializable;
public class GenericBox<T extends String & Comparable<String>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;
    GenericBox(T t,V v,K k){
        this.k=k;
        this.v=v;
        this.t=t;
    }
    public T getT(){
        return this.t;
    }
    public V getV(){
        return this.v;
    }
    public K getK(){
        return this.k;
    }
    public void info(){
        System.out.println("T: " + t.getClass() + "V: " + v.getClass() + "K: "+ k.getClass());
    }

}
