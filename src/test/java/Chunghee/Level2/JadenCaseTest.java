package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class JadenCaseTest {
    @Test
    public void 자젠케이스테스트(){
        JadenCase jadenCase = new JadenCase();
        assertThat(jadenCase.solution("3people unFollowed me"),is("3people Unfollowed Me"));
    }

}
