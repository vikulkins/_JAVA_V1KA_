public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < capacity) super.add(element);
        else System.out.println("wait list is full");
    }

    public String toString() {
        return "boundedWaitList: " + content.toString();
    }
}
