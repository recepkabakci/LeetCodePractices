import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodelandUserNameValidation {
    public static String CodelandUsernameValidation(String str) {
            Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
            Matcher matcher = p.matcher(str);
            return matcher.matches() ? "true" : "false";
    }
}
