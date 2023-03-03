import java.util.Arrays;

public class InvertValues {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{1,-2,3,-4,5})));
    }
    public static int[] invert(int[] array) {
        int positive = 100;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                array[i] *= -1;

            else if (array[i] < 0)
                array[i] = Math.abs(array[i]);
        }
        return array;
    }
}
