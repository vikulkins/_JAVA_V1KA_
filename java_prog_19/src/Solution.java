import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Solution <T, V, K>{
    private T type;
    private V value;
    private K key;
    public Solution(T type, V value, K key){
        this.type = type;
        this.value = value;
        this.key = key;
    }
    public ArrayList<T> newArrayList(T[] objects){
        ArrayList<T> array = new ArrayList<T>();
        for (int i = 0; i<objects.length; i++){
            array.add(objects[i]);
        }
        return array;
    }
    public HashSet<T> newHashSet(T[] objects){
        HashSet<T> array = new HashSet<T>();
        for (int i = 0; i<objects.length; i++){
            array.add(objects[i]);
        }
        return array;
    }
    public HashMap<K, V> newHashMap(K[] keys, V[] values){
        if (keys.length!= values.length) {
            return null;
        }
        HashMap<K, V> array = new HashMap<K, V>();
        for (int i = 0; i<keys.length; i++){
            array.put(keys[i], values[i]);
        }
        return array;
    }
}