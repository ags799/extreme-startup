import java.util.Objects;

public class QuestionAnswerer {
    public String answer(String question) {
        String realQuestion = getRealQuestion(question);
        if (Objects.equals(realQuestion, "what is your name")) {
            return AndrewAnswerer.getName();
        } else if (AndrewAnswerer.questionIsLargest(realQuestion)) {
            return AndrewAnswerer.getQuestionIsLargest(realQuestion);
        } else if (TimAnswerer.questionIsAdd(realQuestion)) {
            return TimAnswerer.getQuestionIsAdd(realQuestion);
        } else if (AndrewAnswerer.questionIsMultiply(realQuestion)) {
            return AndrewAnswerer.getQuestionIsMultiply(realQuestion);
        }
        return "";
    }

    private String getRealQuestion(String question) {
        return question.substring(10);
    }
}
