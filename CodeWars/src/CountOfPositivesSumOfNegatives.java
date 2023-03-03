import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{0, 0})));
    }
    public static int[] countPositivesSumNegatives(int[] input) {
        int result = 0;
        int count = 0;
        if (input == null || input.length == 0) {
            return new int[]{};
        } else {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0)
                    count++;

                else if (input[i] < 0)
                    result += input[i];
            }
        }
        return new int[]{result, count};
    }
}
