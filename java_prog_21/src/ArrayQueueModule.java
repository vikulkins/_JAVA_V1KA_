import java.util.ArrayList;
import java.util.List;

public class ArrayQueueModule<T> {
    List<T> objects;
    ArrayQueueModule() {
        objects = new ArrayList<>();
    }
    public void enqueue(T t) {
        objects.add(t);
    }
    public T element() {
        try {
            return objects.get(0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
    public T dequeue() {
        T result = element();
        objects.remove(0);
        return result;
    }
    public int size() {
        return objects.size();
    }
    public boolean isEmpty() {
        return objects.isEmpty();
    }
    public void clear() {
        objects.clear();
    }

    @Override
    public String toString() {
        return objects.toString();
    }

    public static void main(String[] args) {
        ArrayQueueModule<Integer> queue = new ArrayQueueModule<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("размер очереди: " + queue.size());
        System.out.println("а очередь пустая? " + queue.isEmpty());
        System.out.println("...вывод элементов очереди...");
        System.out.println(queue);
        System.out.println("...удаление первого элемента...");
        System.out.println(queue.dequeue());
        System.out.println("...удаление первого элемента...");
        System.out.println(queue.dequeue());
        System.out.println("...вывод первого элемента...");
        System.out.println(queue.element());
        System.out.println("...вывод элементов очереди...");
        System.out.println(queue);
        queue.clear();
        System.out.println("...очередь была очищена...");
        System.out.println("...вывод элементов очереди...");
        System.out.println(queue);
        System.out.println("...добавим в очередь кое-что...");
        queue.enqueue(6);
        queue.enqueue(6);
        queue.enqueue(6);
        System.out.println("...вывод элементов очереди...");
        System.out.println(queue);
    }
}