public class ArrayQueueADT<T> {
    private int size;
    private int trueNumberOfElement;
    Object[] objects;
    ArrayQueueADT(int size) {
        this.size = size;
        this.trueNumberOfElement = 0;
        this.objects = new Object[size];
    }
    public void enqueue(T t) {
        int i = 0;
        while (this.objects[i] != null) {
            i++;
        }
        this.objects[i] = t;
        this.trueNumberOfElement++;
    }
    public T element() {
        return (T)this.objects[0];
    }
    public T dequeue() {
        T t = (T)this.objects[0];
        for (int i = 0; i < this.trueNumberOfElement - 1; i++) {
            this.objects[i] = this.objects[i+1];
        }
        this.objects[this.trueNumberOfElement-1] = null;
        this.trueNumberOfElement--;
        return t;
    }
    public int size() {
        return this.trueNumberOfElement;
    }
    public boolean isEmpty() {
        if (this.trueNumberOfElement == 0) {
            return true;
        }
        return false;
    }
    public void clear() {
        int i = 0;
        while (this.objects[i] != null) {
            this.objects[i] = null;
            i++;
        }
        this.trueNumberOfElement = 0;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < this.trueNumberOfElement; i++) {
            result += this.objects[i] + " ";
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        ArrayQueueADT<Integer> queue = new ArrayQueueADT<>(5);
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