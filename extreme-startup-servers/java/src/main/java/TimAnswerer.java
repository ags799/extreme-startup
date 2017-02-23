import java.util.Arrays;

/**
 * Created by tnguyen on 2/23/17.
 */
public class TimAnswerer {
  public static boolean questionIsAdd(String realQuestion) {
    return realQuestion.contains("plus");
  }

  public static String getQuestionIsAdd(String realQuestion) {
    int first = Integer.parseInt((Arrays.asList(Arrays.asList(realQuestion.split("is ")).get(1).split(" plus ")).get(0)));
    int second = Integer.parseInt((Arrays.asList(realQuestion.split("plus "))).get(1));
    int sum = first + second;

    return ""+ sum; // what is 12 plus 24
  }
}
