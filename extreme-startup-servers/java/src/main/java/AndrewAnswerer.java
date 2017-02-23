import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

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

    public static boolean questionIsPrime(String realQuestion) {
        return realQuestion.contains("which of the following numbers are primes: ");
    }

    public static String getQuestionIsPrime(String realQuestion) {
        return Arrays.asList(realQuestion.split("which of the following numbers are primes: ")[1].split(", ")).stream().filter(i -> isPrime(Integer.parseInt(i))).collect(Collectors.toList()).toString();
    }

    private static boolean isPrime(int n) {
            for(int i=2;i<n;i++) {
                if(n%i==0)
                    return false;
            }
            return true;
    }

    public static boolean questionIsFibonnaci(String realQuestion) {
        return realQuestion.contains("number in the Fibonacci sequence");
    }

    public static String getQuestionIsFibonnaci(String realQuestion) {
        return "1";
    }

    public static boolean questionIsMinus(String realQuestion) {
        return realQuestion.contains("what is") && realQuestion.contains("minus");
    }

    public static String getQuestionIsMinus(String realQuestion) {
        int a = Integer.parseInt(realQuestion.split("what is ")[1].split(" ")[0]);
        int b = Integer.parseInt(realQuestion.split(" minus ")[1]);
        int d = a - b;
        return "" + d;
    }

    public static boolean questionIsEiffel(String realQuestion) {
        return Objects.equals(realQuestion, "which city is the Eiffel tower in");
    }
}
