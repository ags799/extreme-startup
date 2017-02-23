import java.util.Arrays;

public class AndrewAnswerer {
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
}
