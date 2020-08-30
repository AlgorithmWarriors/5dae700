package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class RightBracketTest {
    @Test
    public void 올바른괄호테스트(){
        RightBracket rightBracket =new RightBracket();
        String[] strings = {"()()","(())()",")()(","(()("};
        Boolean[] result ={true,true,false,false};
        for(int i=0;i<4;i++) {
            assertThat(rightBracket.solution(strings[i]), is(result[i]));
        }
    }
}
