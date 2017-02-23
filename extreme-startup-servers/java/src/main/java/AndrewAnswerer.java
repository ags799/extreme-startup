import java.util.Arrays;
import java.util.Objects;

public class AndrewAnswerer {
    private static String questionIsSpainEuro;

    public static String getName() {
        return "merlions";
    }

    public static boolean questionIsLargest(String realQuestion) {
        return realQuestion.startsWith("which of the following numbers is the largest: ");
    }

    public static String getQuestionIsLargest(String realQuestion) {
        return "" + Arrays.asList(Arrays.asList(realQuestion.split(": ")).get(1).split(", ")).stream().mapToInt(Integer::parseInt).max().getAsInt();
    }

    public static boolean questionIsMultiply(String realQuestion) {
        return realQuestion.contains("multiplied by");
    }

    public static String getQuestionIsMultiply(String realQuestion) {
        int a = Integer.parseInt(realQuestion.split("what is ")[1].split(" ")[0]);
        int b = Integer.parseInt(realQuestion.split("multiplied by ")[1]);
        int p = a * b;
        return "" + p;
    }

    public static boolean questionIsBondDrNo(String realQuestion) {
        return Objects.equals(realQuestion, "who played James Bond in the film Dr No");
    }

    public static String getQuestionIsBondDrNo(String realQuestion) {
        return "Sean Connery";
    }

    public static boolean questionIsPrimeMinister(String realQuestion) {
        return Objects.equals(realQuestion, "who is the Prime Minister of Great Britain");
    }

    public static String getQuestionIsPrimeMinister(String realQuestion) {
        return "Theresa May";
    }

    public static boolean questionIsSpainEuro(String realQuestion) {
        return Objects.equals("what currency did Spain use before the Euro", realQuestion);
    }

    public static String getQuestionIsSpainEuro() {
        return "peseta";
    }
}
