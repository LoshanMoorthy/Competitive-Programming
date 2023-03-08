import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dnaSeq = sc.nextLine();

        int count = 1;
        int max = 0;
        int maxChar = 0;

        char[] arr = dnaSeq.toCharArray();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                count++;

            else {
                if (count > max) {
                    max = count;
                    maxChar = arr[i - 1];
                }
                count = 1;
            }
        }
        if (count > max) {
            max = count;
            maxChar = arr[arr.length - 1];
        }

        System.out.println(max);
    }
}
