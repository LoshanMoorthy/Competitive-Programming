import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt(), s = 0;

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            s += a;
        }
        System.out.println(n * (n + 1) / 2 - s);
    }
}
