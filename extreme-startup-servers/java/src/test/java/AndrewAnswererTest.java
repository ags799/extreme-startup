import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public final class AndrewAnswererTest {
    @Test
    public void getQuestionIsLargest() throws Exception {
        assertThat(AndrewAnswerer.getQuestionIsLargest("which of the following numbers is the largest: 94, 379, 76, 822")).isEqualTo("822");
    }

}