public class SumArrays {
    public static void main(String[] args) {
        System.out.println(sum(new double[]{}));
    }
    public static double sum(double[] numbers) {
        double result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        return result;
    }
}
