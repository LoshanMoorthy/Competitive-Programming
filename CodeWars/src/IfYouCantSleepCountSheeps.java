public class IfYouCantSleepCountSheeps {
    public static void main(String[] args) {
        System.out.println(countingSheep(5));
    }
    public static String countingSheep(int num) {
        String s = "";
            for (int i = 0; i < num; i++) {
                s += 1 + i + " sheep...";
            }
        return s;
    }
}
