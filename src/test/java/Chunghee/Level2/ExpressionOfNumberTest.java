package Chunghee.Level2;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class ExpressionOfNumberTest {
    @Test
    public void 숫자의표현테스트(){
        ExpressionOfNumber expressionOfNumber = new ExpressionOfNumber();
        assertThat(expressionOfNumber.solution(15),is(4));
    }
}
