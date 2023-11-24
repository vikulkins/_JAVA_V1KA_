import java.util.Iterator;
public class UnfairWaitList <E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        Iterator<E> iterator = content.iterator();
        while (iterator.hasNext()) {
            E e = iterator.next();
            if (e.equals(element)) {
                iterator.remove();
                break;
            }
        }
    }

    public void moveToBack(E element) {
        if (content.remove(element)) {
            content.add(element);
        }
    }
}