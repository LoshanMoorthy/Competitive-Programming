public class TheFeastofManyBeasts {
    public static void main(String[] args) {
        System.out.println(feast("brown bear","bear claw"));
    }
    public static boolean feast(String beast, String dish) {
        if (beast.charAt(beast.length() - 1) == (dish.charAt(dish.length()  - 1)) && beast.charAt(0) == (dish.charAt(0))) {
            return true;
        }
        return false;
    }
}
