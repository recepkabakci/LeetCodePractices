import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodelandUserNameValidation {
    public static boolean CodelandUsernameValidation(String str) {
        // Regex to check valid username.
        String regex = "^[A-Za-z]\\w{5,29}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the username is empty
        // return false
        if (str == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(str);

        // Return if the username
        // matched the ReGex
        return m.matches();

    }
}
