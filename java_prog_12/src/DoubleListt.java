import java.util.*;

public class DoubleListt {
    public static void main(String[] args) {
        System.out.println("добро пожаловать в игру 'Пьяница'");
        Scanner scanner = new Scanner(System.in);
        DoubleList<Integer> player1 = new DoubleList<>();
        DoubleList<Integer> player2 = new DoubleList<>();

        System.out.println("введите карты первого игрока");
        int card = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            player1.addLast(card%10);
            card=card/10;
        }

        System.out.println("введите карты второго игрока");
        card = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            player2.addLast(card%10);
            card=card/10;
        }

        int moves = 0;
        while (moves < 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.removeFirst();
            int card2 = player2.removeFirst();
            if (card1 == 0 && card2 == 9) {
                player1.addLast(card1);
                player1.addLast(card2);
            } else if (card2 == 0 && card1 == 9) {
                player2.addLast(card2);
                player2.addLast(card1);
            } else if (card1 > card2) {
                player1.addLast(card2);
                player1.addLast(card1);
            } else {
                player2.addLast(card1);
                player2.addLast(card2);
            }
            moves++;
        }
        if (moves == 106) {
            System.out.println("botva");
        } else if (player1.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}

class DoubleList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoubleList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            return null;
        }
        T value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;

        public Node(T value) {
            this.value = value;
            prev = null;
            next = null;
        }
    }
}