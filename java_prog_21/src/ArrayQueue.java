public class ArrayQueue<T> extends AbstractQueue<T> {
    private int size;
    private int trueNumberOfElement;
    Object[] objects;
    ArrayQueue(int size) {
        this.size = size;
        trueNumberOfElement = 0;
        objects = new Object[size];
    }
    public void enqueue(T t) {
        int i = 0;
        while (objects[i] != null) {
            i++;
        }
        objects[i] = t;
        trueNumberOfElement++;
    }
    public T element() {
        return (T)objects[0];
    }
    public T dequeue() {
        T t = (T)objects[0];
        for (int i = 0; i < trueNumberOfElement - 1; i++) {
            objects[i] = objects[i+1];
        }
        objects[trueNumberOfElement-1] = null;
        trueNumberOfElement--;
        return t;
    }
    public int size() {
        return trueNumberOfElement;
    }
    public boolean isEmpty() {
        if (trueNumberOfElement == 0) {
            return true;
        }
        return false;
    }
    public void clear() {
        int i = 0;
        while (objects[i] != null) {
            objects[i] = null;
            i++;
        }
        trueNumberOfElement = 0;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < trueNumberOfElement; i++) {
            result += objects[i] + " ";
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(5);
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