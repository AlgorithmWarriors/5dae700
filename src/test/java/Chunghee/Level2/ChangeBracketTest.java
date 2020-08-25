package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class ChangeBracketTest {
    @Test
    public void 괄호변환테스트(){
        String[] ps = {"(()())()",")(","()))((()",")()()()("};
        String[] answer = {"(()())()","()","()(())()","(((())))"};
        ChangeBracket changeBracket = new ChangeBracket();
        for(int i =0; i<ps.length;i++) {
            assertThat(changeBracket.solution(ps[2]), is(answer[2]));
        }
        assertThat(changeBracket.isCorrect("()"),is(true));
    }
}
