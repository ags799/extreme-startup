import java.util.Arrays;
import sun.reflect.annotation.AnnotationSupport;

/**
 * Created by tnguyen on 2/23/17.
 */
public class TimAnswerer {
  public static boolean questionIsAdd(String realQuestion) {
    return realQuestion.contains("plus");
  }

  public static String getQuestionIsAdd(String realQuestion) {
    if (realQuestion.split("plus").length > 2) {
      return AndrewAnswerer.threesome(realQuestion);
    } else if (realQuestion.contains("multiplied")) {
      return AndrewAnswerer.plusMultiply(realQuestion);
    }
    int first = Integer.parseInt((Arrays.asList(Arrays.asList(realQuestion.split("is ")).get(1).split(" plus ")).get(0)));
    int second = Integer.parseInt((Arrays.asList(realQuestion.split("plus "))).get(1));
    int sum = first + second;

    return ""+ sum; // what is 12 plus 24
  }
}
