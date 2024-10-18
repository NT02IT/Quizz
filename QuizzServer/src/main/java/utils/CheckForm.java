package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForm {
    public static boolean checkEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    public static boolean isVietnamesePhoneNumber(String phoneNumber) {
        // Biểu thức chính quy cho số di động Việt Nam
        String mobileRegex = "^(09|08|07|03|05)\\d{7}$";

        // Biểu thức chính quy cho số cố định Việt Nam (dạng tổng quát)
        String fixedLineRegex = "^(0\\d{2})\\d{7,8}$";

        Pattern mobilePattern = Pattern.compile(mobileRegex);
        Pattern fixedLinePattern = Pattern.compile(fixedLineRegex);

        Matcher mobileMatcher = mobilePattern.matcher(phoneNumber);
        Matcher fixedLineMatcher = fixedLinePattern.matcher(phoneNumber);

        return mobileMatcher.matches() || fixedLineMatcher.matches();
    }

}
