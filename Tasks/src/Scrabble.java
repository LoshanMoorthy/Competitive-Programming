import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Player 1: ");
        String word1 = sc.nextLine();

        System.out.print("Player 2: ");
        String word2 = sc.nextLine();

        int player1 = computeScore(word1);
        int player2 = computeScore(word2);

        if (player1 > player2) {
            System.out.println("Player 1 wins!");
        } else if (player2 > player1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Tie!");
        }

    }

    public static int computeScore(String word) {
        int[] letterValues = {
            1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10
        };

        word = word.toUpperCase();

        int totalValue = 0;

        for (char letter : word.toCharArray()) {
            int index = letter - 'A';
            if (index >= 0 && index < 26) {
                totalValue += letterValues[index];
            }
        }
        return totalValue;
    }
}
