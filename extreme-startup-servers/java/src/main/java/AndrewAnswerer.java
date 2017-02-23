import java.util.Arrays;

public class AndrewAnswerer {
    public static String getName() {
        return "merlions";
    }

    public static boolean questionIsLargest(String realQuestion) {
        return realQuestion.contains("largest");
    }

    public static String getQuestionIsLargest(String realQuestion) {
        return "" + Arrays.asList(Arrays.asList(realQuestion.split(": ")).get(1).split(", ")).stream().mapToInt(Integer::parseInt).max().getAsInt();
    }
}
