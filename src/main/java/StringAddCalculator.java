import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class StringAddCalculator {
    public static int splitAndSum(String text) {
        if (text == null || text.isEmpty())
            return 0;
        String[] numbers = text.split(",|:");
        return sum(numbers);
    }

    private static int sum(String[] numbers) {
        int sum = 0;
        for (int i = 0; i<numbers.length;i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }
}
