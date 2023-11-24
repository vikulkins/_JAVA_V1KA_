import java.util.*;

public class Stackk {
    public static void main(String[] args) {
        System.out.println("добро пожаловать в игру 'Пьяница'");
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();

        System.out.println("введите карты первого игрока");
        int card = scanner.nextInt();
        String str = new StringBuilder(String.valueOf(card)).reverse().toString();
        card = Integer.parseInt(str);

        for (int i = 0; i < 5; i++) {
            player1.push(card%10);
            card = card/10;
        }
        // 13579 24680

        System.out.println("введите карты второго игрока");
        card = scanner.nextInt();
        str = new StringBuilder(String.valueOf(card)).reverse().toString();
        card = Integer.parseInt(str);
        for (int i = 0; i < 5; i++) {
            player2.push(card%10);
            card = card/10;
        }

        int moves = 0;
        while (moves < 106 && !player1.empty() && !player2.empty()) {
            int card1 = player1.pop();
            int card2 = player2.pop();
            if (card1 == 0 && card2 == 9) {
                player1.add(card1);
                player1.add(card2);
            } else if (card2 == 0 && card1 == 9) {
                player2.add(card2);
                player2.add(card1);
            } else if (card1 > card2) {
                player1.add(card2);
                player1.add(card1);
            } else {
                player2.add(card1);
                player2.add(card2);
            }
            moves++;
        }
        if (moves == 106) {
            System.out.println("botva");
        } else if (player1.empty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}