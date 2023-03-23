public class ReverseString {
    public static String FirstReverse(String str) {
        StringBuilder input = new StringBuilder();
        input.append(str).reverse();
        String singleString = input.toString();
        return singleString;
    }
}
