public class RemoveConsecutiveDuplicateWords {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("hwvvp aw wwj wwj hwvvp aw wwj"));
    }
    public static String removeConsecutiveDuplicates(String s){
        String[] allWords;
        String result = "";

        allWords = s.split(" ");

        for (int i = 0; i < allWords.length; i++) {
            for (int j = i + 1; j < allWords.length; j++) {
                if (allWords[i].equals(allWords[j])) {
                    allWords[j] = "Remove";
                }
            }
        }

        for (String word : allWords) {
            if(word != "Remove") {
                result = result + word + " ";
            }
        }
        return result;
    }
}
