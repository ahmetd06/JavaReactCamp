package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckWithRegex {
	public static boolean isEmail(String eMail) {

		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		return matcher.matches();
	}
}
