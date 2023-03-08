import java.util.Arrays;

public class ConvertAStringToAnArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Hej Hej Hej")));
    }
    public static String[] stringToArray(String s) {
        String[] allWords;

        allWords = s.split(" ");

        return allWords;


    }
}
