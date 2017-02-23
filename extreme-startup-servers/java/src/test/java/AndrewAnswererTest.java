import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public final class AndrewAnswererTest {
    @Test
    public void questionIsLargest() throws Exception {
        assertThat(AndrewAnswerer.questionIsLargest("which of the following numbers is the largest: 563, 4"))
                .isTrue();
    }

    @Test
    public void getQuestionIsLargest() throws Exception {
        assertThat(AndrewAnswerer.getQuestionIsLargest("which of the following numbers is the largest: 94, 379, 76, 822")).isEqualTo("822");
    }

    @Test
    public void plusMultiply() throws Exception {
        assertThat(AndrewAnswerer.plusMultiply("what is 7 multiplied by 0 plus 19")).isEqualTo("" + 19);

    }
}