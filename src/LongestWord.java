public class LongestWord {
    public static String LongestWord(String sen) {
        String[] words = sen.toLowerCase()
                .replaceAll("[^a-zA-Z0-9 ]", "")
                .split(" ");
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
