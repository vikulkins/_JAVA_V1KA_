import java.util.*;

public class Dequeuee {
    public static void main(String[] args) {
        System.out.println("добро пожаловать в игру 'Пьяница'");
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();

        System.out.println("введите карты первого игрока");
        int card = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            player1.addLast(card%10);
            card = card/10;
        }

        System.out.println("введите карты второго игрока");
        card = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            player2.addLast(card%10);
            card = card/10;
        }

        int moves = 0;
        while (moves < 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.pollFirst();
            int card2 = player2.pollFirst();
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