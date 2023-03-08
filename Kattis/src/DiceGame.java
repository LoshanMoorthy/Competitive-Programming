import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] gunnar = new int[4];
        int[] emma = new int[4];

        for (int i = 0; i < gunnar.length; i++) {
            gunnar[i] = sc.nextInt();
        }

        for (int i = 0; i < emma.length; i++) {
            emma[i] = sc.nextInt();
        }

        diceGame(gunnar, emma);
    }

    public static void diceGame(int[] gunnar, int[] emma) {
        int gunnarResult = 0;
        int emmaResult = 0;

        for (int i = 0; i < gunnar.length; i++) {
            gunnarResult += gunnar[i];
        }

        for (int i = 0; i < emma.length; i++) {
            emmaResult += emma[i];
        }

        if (emmaResult > gunnarResult)
            System.out.println("Emma");

        else if (gunnarResult > emmaResult)
            System.out.println("Gunnar");

        else {
            System.out.println("Tie");
        }
    }
}