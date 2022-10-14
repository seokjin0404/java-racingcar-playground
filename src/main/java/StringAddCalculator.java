import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class StringAddCalculator {

    public static int splitAndSum(String text) throws RuntimeException {
        if (text == null || text.isEmpty())
            return 0;
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            return sum(getTokens(m));
        }
        return sum(text.split(",|:"));
    }

    private static String[] getTokens(Matcher m) {
        String customDelimiter = m.group(1);
        String[] tokens = m.group(2).split(customDelimiter);
        return tokens;
    }

    private static int sum(String[] numbers) throws RuntimeException {
        int sum = 0;
        int number;
        for (int i = 0; i<numbers.length;i++) {
            number = Integer.parseInt(numbers[i]);
            check(number);
            sum += number;
        }
        return sum;
    }
    private static void check(int number) throws RuntimeException {
        if (number < 0)
            throw new RuntimeException();
    }
}
