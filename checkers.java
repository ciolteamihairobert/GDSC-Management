package cccccccccc;
import java.util.regex.*;
import java.util.ArrayList;

public class checkers {
    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
    Pattern pattern = Pattern.compile(regex);

    public boolean checkEmail(String email)
    {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}