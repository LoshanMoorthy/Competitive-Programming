import java.util.Arrays;

public class LostWithoutMaps {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{2, 3, 1})));
    }
    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}
