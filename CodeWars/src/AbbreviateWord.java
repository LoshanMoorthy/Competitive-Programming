public class AbbreviateWord {
    public static String abbrevName(String name) {
        int idxLastWhitespace = name.lastIndexOf(' ');
        return name.substring(0, 1).toUpperCase() + "." +  name.substring(idxLastWhitespace + 1, idxLastWhitespace + 2).toUpperCase();
    }
}
