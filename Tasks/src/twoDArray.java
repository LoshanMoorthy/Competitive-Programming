public class twoDArray {

    public static void main(String[] args) {
        int[][] integers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += integers[j][i];
            }

            System.out.println("Sum of column " + (i + 1) + " sum " + sum);
        }
    }

}
